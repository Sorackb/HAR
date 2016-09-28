package lucassouza.org.har.model.vo;

import java.util.Date;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Entry {

  /**
   * Reference to the parent page. Leave out this field if the application does
   * not support grouping by pages.
   */
  private String pageref;
  /**
   * Date and time stamp of the request start (ISO 8601 -
   * YYYY-MM-DDThh:mm:ss.sTZD).
   */
  private Date startedDateTime;
  /**
   * Total elapsed time of the request in milliseconds. This is the sum of all
   * timings available in the timings object (i.e. not including -1 values) .
   */
  private Long time;
  /**
   * Detailed info about the request.
   */
  private Request request;
  /**
   * Detailed info about the response.
   */
  private Response response;
  //TODO implementation of cache
  /**
   * Detailed timing info about request/response round trip.
   */
  private Timings timings;
  /**
   * IP address of the server that was connected (result of DNS resolution).
   */
  private String serverIPAddress;
  /**
   * Unique ID of the parent TCP/IP connection, can be the client or server port
   * number. Note that a port number doesn't have to be unique identifier in
   * cases where the port is shared for more connections. If the port isn't
   * available for the application, any other unique connection ID can be used
   * instead (e.g. connection index). Leave out this field if the application
   * doesn't support this info.
   */
  private String connection;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;

  public static class Builder {

    private String pageref;
    private Date startedDateTime;
    private Long time;
    private Request request;
    private Response response;
    private Timings timings;
    private String serverIPAddress;
    private String connection;
    private String comment;

    private Builder() {
    }

    public Builder pageref(final String value) {
      this.pageref = value;
      return this;
    }

    public Builder startedDateTime(final Date value) {
      this.startedDateTime = value;
      return this;
    }

    public Builder time(final Long value) {
      this.time = value;
      return this;
    }

    public Builder request(final Request value) {
      this.request = value;
      return this;
    }

    public Builder response(final Response value) {
      this.response = value;
      return this;
    }

    public Builder timings(final Timings value) {
      this.timings = value;
      return this;
    }

    public Builder serverIPAddress(final String value) {
      this.serverIPAddress = value;
      return this;
    }

    public Builder connection(final String value) {
      this.connection = value;
      return this;
    }

    public Builder comment(final String value) {
      this.comment = value;
      return this;
    }

    public Entry build() {
      return new Entry(this.pageref, this.startedDateTime, this.time, this.request, this.response, this.timings, this.serverIPAddress, this.connection, this.comment);
    }
  }

  public static Entry.Builder builder() {
    return new Entry.Builder();
  }

  private Entry(final String pageref, final Date startedDateTime, final Long time, final Request request, final Response response, final Timings timings, final String serverIPAddress, final String connection, final String comment) {
    this.pageref = pageref;
    this.startedDateTime = startedDateTime;
    this.time = time;
    this.request = request;
    this.response = response;
    this.timings = timings;
    this.serverIPAddress = serverIPAddress;
    this.connection = connection;
    this.comment = comment;
  }

  public String getPageref() {
    return pageref;
  }

  public void setPageref(String pageref) {
    this.pageref = pageref;
  }

  public Date getStartedDateTime() {
    return startedDateTime;
  }

  public void setStartedDateTime(Date startedDateTime) {
    this.startedDateTime = startedDateTime;
  }

  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public Request getRequest() {
    return request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }

  public Timings getTimings() {
    return timings;
  }

  public void setTimings(Timings timings) {
    this.timings = timings;
  }

  public String getServerIPAddress() {
    return serverIPAddress;
  }

  public void setServerIPAddress(String serverIPAddress) {
    this.serverIPAddress = serverIPAddress;
  }

  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
