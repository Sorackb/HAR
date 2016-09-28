package lucassouza.org.har.model.vo;

import java.util.List;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Request {

  /**
   * Request method (GET, POST, ...).
   */
  private String method;
  /**
   * Absolute URL of the request (fragments are not included).
   */
  private String url;
  /**
   * Request HTTP Version.
   */
  private String httpVersion;
  /**
   * List of cookie objects.
   */
  private List<Cookie> cookies;
  /**
   * List of header objects.
   */
  private List<Pair> headers;
  /**
   * List of query parameter objects.
   */
  private List<Pair> queryString;
  /**
   * Posted data info.
   */
  private PostData postData;
  /**
   * Total number of bytes from the start of the HTTP request message until (and
   * including) the double CRLF before the body. Set to -1 if the info is not
   * available.
   */
  private Integer headersSize = -1;
  /**
   * Size of the request body (POST data payload) in bytes. Set to -1 if the
   * info is not available.
   */
  private Integer bodySize = -1;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;
}
