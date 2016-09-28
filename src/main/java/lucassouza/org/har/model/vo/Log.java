package lucassouza.org.har.model.vo;

import java.util.List;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Log {

  /**
   * Version number of the format. If empty, string "1.1" is assumed by default.
   */
  private String version = "1.1";
  /**
   * Name and version info of the log creator application.
   */
  private Creator creator;
  /**
   * Name and version info of used browser.
   */
  private Browser browser;
  /**
   * List of all exported (tracked) pages. Leave out this field if the
   * application does not support grouping by pages.
   */
  private List<Page> pages;
  /**
   * List of all exported (tracked) requests.
   */
  private List<Entry> entries;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;

  public static class Builder {

    private String version;
    private Creator creator;
    private Browser browser;
    private List<Page> pages;
    private List<Entry> entries;
    private String comment;

    public Builder version(final String value) {
      this.version = value;
      return this;
    }

    public Builder creator(final Creator value) {
      this.creator = value;
      return this;
    }

    public Builder browser(final Browser value) {
      this.browser = value;
      return this;
    }

    public Builder pages(final List<Page> value) {
      this.pages = value;
      return this;
    }

    public Builder entries(final List<Entry> value) {
      this.entries = value;
      return this;
    }

    public Builder comment(final String value) {
      this.comment = value;
      return this;
    }

    public Log build() {
      return new Log(this.version, this.creator, this.browser, this.pages, this.entries, this.comment);
    }
  }

  public static Log.Builder builder() {
    return new Log.Builder();
  }

  private Log(final String version, final Creator creator, final Browser browser, final List<Page> pages, final List<Entry> entries, final String comment) {
    this.version = version;
    this.creator = creator;
    this.browser = browser;
    this.pages = pages;
    this.entries = entries;
    this.comment = comment;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Creator getCreator() {
    return creator;
  }

  public void setCreator(Creator creator) {
    this.creator = creator;
  }

  public Browser getBrowser() {
    return browser;
  }

  public void setBrowser(Browser browser) {
    this.browser = browser;
  }

  public List<Page> getPages() {
    return pages;
  }

  public void setPages(List<Page> pages) {
    this.pages = pages;
  }

  public List<Entry> getEntries() {
    return entries;
  }

  public void setEntries(List<Entry> entries) {
    this.entries = entries;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
