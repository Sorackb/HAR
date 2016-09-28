package lucassouza.org.har.model.vo;

import java.util.Date;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Cookie {

  /**
   * The name of the cookie.
   */
  private String name;
  /**
   * The cookie value.
   */
  private String value;
  /**
   * The path pertaining to the cookie.
   */
  private String path;
  /**
   * The host of the cookie.
   */
  private String domain;
  /**
   * Cookie expiration time. (ISO 8601 - YYYY-MM-DDThh:mm:ss.sTZD, e.g.
   * 2009-07-24T19:20:30.123+02:00).
   */
  private Date expires;
  /**
   * Set to true if the cookie is HTTP only, false otherwise.
   */
  private Boolean httpOnly;
  /**
   * True if the cookie was transmitted over ssl, false otherwise.
   */
  private Boolean secure;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;

  public static class Builder {

    private String name;
    private String value;
    private String path;
    private String domain;
    private Date expires;
    private Boolean httpOnly;
    private Boolean secure;
    private String comment;

    public Builder name(final String value) {
      this.name = value;
      return this;
    }

    public Builder value(final String value) {
      this.value = value;
      return this;
    }

    public Builder path(final String value) {
      this.path = value;
      return this;
    }

    public Builder domain(final String value) {
      this.domain = value;
      return this;
    }

    public Builder expires(final Date value) {
      this.expires = value;
      return this;
    }

    public Builder httpOnly(final Boolean value) {
      this.httpOnly = value;
      return this;
    }

    public Builder secure(final Boolean value) {
      this.secure = value;
      return this;
    }

    public Builder comment(final String value) {
      this.comment = value;
      return this;
    }

    public Cookie build() {
      return new Cookie(this.name, this.value, this.path, this.domain, this.expires, this.httpOnly, this.secure, this.comment);
    }
  }

  public static Cookie.Builder builder() {
    return new Cookie.Builder();
  }

  private Cookie(final String name, final String value, final String path, final String domain, final Date expires, final Boolean httpOnly, final Boolean secure, final String comment) {
    this.name = name;
    this.value = value;
    this.path = path;
    this.domain = domain;
    this.expires = expires;
    this.httpOnly = httpOnly;
    this.secure = secure;
    this.comment = comment;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public Date getExpires() {
    return expires;
  }

  public void setExpires(Date expires) {
    this.expires = expires;
  }

  public Boolean getHttpOnly() {
    return httpOnly;
  }

  public void setHttpOnly(Boolean httpOnly) {
    this.httpOnly = httpOnly;
  }

  public Boolean getSecure() {
    return secure;
  }

  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
