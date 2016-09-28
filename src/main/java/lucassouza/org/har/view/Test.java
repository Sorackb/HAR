package lucassouza.org.har.view;

import java.util.UUID;
import lucassouza.org.har.model.HAR;
import lucassouza.org.har.model.vo.Browser;
import lucassouza.org.har.model.vo.Creator;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Test {

  public static void main(String[] args) {
    HAR har;
    Creator creator;
    Browser browser;
    UUID uuid;

    creator = Creator.builder()
            .name("Teste")
            .version("")
            .build();
    browser = Browser.builder()
            .name("Firefox")
            .version("1.0")
            .build();

    har = new HAR(creator, browser);
    uuid = har.start(null);
    har.end(uuid, null);
    har.build();
  }
}
