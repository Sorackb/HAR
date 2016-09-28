package lucassouza.org.har.model.vo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Page {

  /**
   * Date and time stamp for the beginning of the page load (ISO 8601 -
   * YYYY-MM-DDThh:mm:ss.sTZD, e.g. 2009-07-24T19:20:30.45+01:00).
   */
  private Date startedDateTime;
  /**
   * Unique identifier of a page within the <log>. Entries use it to refer the
   * parent page.
   */
  private String id;
  /**
   * Page title.
   */
  private String title;
  /**
   * Detailed timing info about page load.
   */
  private List<PageTiming> pageTimings;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;
}
