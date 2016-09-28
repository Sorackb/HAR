package lucassouza.org.har.model.vo;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Timings {

  /**
   * Time spent in a queue waiting for a network connection. Use -1 if the
   * timing does not apply to the current request.
   */
  private Long blocked = -1L;
  /**
   * DNS resolution time. The time required to resolve a host name. Use -1 if
   * the timing does not apply to the current request.
   */
  private Long dns = -1L;
  /**
   * Time required to create TCP connection. Use -1 if the timing does not apply
   * to the current request.
   */
  private Long connect;
  /**
   * Time required to send HTTP request to the server.
   */
  private Long send;
  /**
   * Waiting for a response from the server.
   */
  private Long wait;
  /**
   * Time required to read entire response from the server (or cache).
   */
  private Long receive;
  /**
   * Time required for SSL/TLS negotiation. If this field is defined then the
   * time is also included in the connect field (to ensure backward
   * compatibility with HAR 1.1). Use -1 if the timing does not apply to the
   * current request.
   */
  private Long ssl = -1L;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;

  public static class Builder {

    private Long blocked = -1l;
    private Long dns = -1l;
    private Long connect;
    private Long send;
    private Long wait;
    private Long receive;
    private Long ssl = -1l;
    private String comment;

    private Builder() {
    }

    public Builder blocked(final Long value) {
      this.blocked = value;
      return this;
    }

    public Builder dns(final Long value) {
      this.dns = value;
      return this;
    }

    public Builder connect(final Long value) {
      this.connect = value;
      return this;
    }

    public Builder send(final Long value) {
      this.send = value;
      return this;
    }

    public Builder wait(final Long value) {
      this.wait = value;
      return this;
    }

    public Builder receive(final Long value) {
      this.receive = value;
      return this;
    }

    public Builder ssl(final Long value) {
      this.ssl = value;
      return this;
    }

    public Builder comment(final String value) {
      this.comment = value;
      return this;
    }

    public Timings build() {
      return new Timings(blocked, dns, connect, send, wait, receive, ssl, comment);
    }
  }

  public static Timings.Builder builder() {
    return new Timings.Builder();
  }

  private Timings(final Long blocked, final Long dns, final Long connect, final Long send, final Long wait, final Long receive, final Long ssl, final String comment) {
    this.blocked = blocked;
    this.dns = dns;
    this.connect = connect;
    this.send = send;
    this.wait = wait;
    this.receive = receive;
    this.ssl = ssl;
    this.comment = comment;
  }

  public Long getBlocked() {
    return blocked;
  }

  public void setBlocked(Long blocked) {
    this.blocked = blocked;
  }

  public Long getDns() {
    return dns;
  }

  public void setDns(Long dns) {
    this.dns = dns;
  }

  public Long getConnect() {
    return connect;
  }

  public void setConnect(Long connect) {
    this.connect = connect;
  }

  public Long getSend() {
    return send;
  }

  public void setSend(Long send) {
    this.send = send;
  }

  public Long getWait() {
    return wait;
  }

  public void setWait(Long wait) {
    this.wait = wait;
  }

  public Long getReceive() {
    return receive;
  }

  public void setReceive(Long receive) {
    this.receive = receive;
  }

  public Long getSsl() {
    return ssl;
  }

  public void setSsl(Long ssl) {
    this.ssl = ssl;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Long totalize() {
    Long sum = 0L;

    if (this.blocked != null && this.blocked > 0) {
      sum = sum + this.blocked;
    }

    if (this.dns != null && this.dns > 0) {
      sum = sum + this.dns;
    }

    if (this.connect != null && this.connect > 0) {
      sum = sum + this.connect;
    }

    if (this.send != null && this.send > 0) {
      sum = sum + this.send;
    }

    if (this.wait != null && this.wait > 0) {
      sum = sum + this.wait;
    }

    if (this.receive != null && this.receive > 0) {
      sum = sum + this.receive;
    }

    if (this.ssl != null && this.ssl > 0) {
      sum = sum + this.ssl;
    }

    return sum;
  }
}
