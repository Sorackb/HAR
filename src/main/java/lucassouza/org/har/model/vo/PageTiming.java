package lucassouza.org.har.model.vo;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class PageTiming {

  /**
   * Content of the page loaded. Number of milliseconds since page load started
   * (page.startedDateTime). Use -1 if the timing does not apply to the current
   * request.
   */
  private Long onContentLoad;
  /**
   * Page is loaded (onLoad event fired). Number of milliseconds since page load
   * started (page.startedDateTime). Use -1 if the timing does not apply to the
   * current request.
   */
  private Long onLoad;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;
}
