package lucassouza.org.har.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import lucassouza.org.har.model.vo.Browser;
import lucassouza.org.har.model.vo.Creator;
import lucassouza.org.har.model.vo.Entry;
import lucassouza.org.har.model.vo.Log;
import lucassouza.org.har.model.vo.Page;
import lucassouza.org.har.model.vo.Request;
import lucassouza.org.har.model.vo.Response;
import lucassouza.org.har.model.vo.Timings;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class HAR {

  private final Log.Builder logBuilder;
  private final HashMap<UUID, Page> pageMap;
  private final List<Entry> entries;
  private final HashMap<UUID, Entry> entryMap;

  public HAR(Creator creator, Browser browser) {
    this.pageMap = new HashMap<>();
    this.entries = new ArrayList<>();
    this.entryMap = new HashMap<>();

    this.logBuilder = Log.builder()
            .version("1.2")
            .creator(creator)
            .browser(browser);
  }

  public void build() {
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssX")
            .create();
    List<Page> pages;

    pages = new ArrayList<>(this.pageMap.values());

    this.logBuilder
            .pages(pages)
            .entries(this.entries)
            .build();

    System.out.println(gson.toJson(this.logBuilder.build()));
  }

  public UUID start(Request request) {
    Entry entry;
    UUID uuid;

    uuid = UUID.randomUUID();
    entry = Entry.builder()
            .startedDateTime(new Date())
            .request(request)
            .build();

    this.entryMap.put(uuid, entry);

    return uuid;
  }

  public void end(UUID uuid, Response response) {
    Timings timings;

    timings = Timings.builder()
            .build();
    this.end(uuid, response, timings);
  }

  public void end(UUID uuid, Response response, Timings timings) {
    Period period;
    Entry entry;
    Long time;

    entry = this.entryMap.get(uuid);
    period = new Period(new DateTime(entry.getStartedDateTime()), new DateTime());
    timings.setWait(new Long(period.getMillis()));
    time = timings.totalize();
    entry.setTime(time);
    entry.setResponse(response);
    entry.setTimings(timings);
    this.entries.add(entry);
    this.entryMap.remove(uuid);
  }
}
