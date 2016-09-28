package lucassouza.org.har.model.vo;

import java.util.List;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Response {

  /**
   * Response status.
   */
  private Integer status;
  /**
   * Response status description.
   */
  private String statusText;
  /**
   * Response HTTP Version.
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
   * Details about the response body.
   */
  private Content content;
  /**
   * Redirection target URL from the Location response header.
   */
  private String redirectURL;
  /**
   * Total number of bytes from the start of the HTTP response message until
   * (and including) the double CRLF before the body. Set to -1 if the info is
   * not available.
   */
  private Integer headersSize = -1;
  /**
   * Size of the received response body in bytes. Set to zero in case of
   * responses coming from the cache (304). Set to -1 if the info is not
   * available.
   */
  private Integer bodySize = -1;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;
}
