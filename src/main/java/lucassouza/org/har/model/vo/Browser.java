package lucassouza.org.har.model.vo;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Browser {

  /**
   * Name of the application/browser used to export the log.
   */
  private String name;
  /**
   * Version of the application/browser used to export the log.
   */
  private String version;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;

  public static class Builder {

    private String name;
    private String version;
    private String comment;

    public Builder name(final String value) {
      this.name = value;
      return this;
    }

    public Builder version(final String value) {
      this.version = value;
      return this;
    }

    public Builder comment(final String value) {
      this.comment = value;
      return this;
    }

    public Browser build() {
      return new Browser(this.name, this.version, this.comment);
    }
  }

  private Browser(final String name, final String version, final String comment) {
    this.name = name;
    this.version = version;
    this.comment = comment;
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
