package lucassouza.org.har.model.vo;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Content {

  /**
   * Length of the returned content in bytes. Should be equal to
   * response.bodySize if there is no compression and bigger when the content
   * has been compressed.
   */
  private Integer size;
  /**
   * Number of bytes saved. Leave out this field if the information is not
   * available.
   */
  private Integer compression;
  /**
   * MIME type of the response text (value of the Content-Type response header).
   * The charset attribute of the MIME type is included (if available).
   */
  private String mimeType;
  /**
   * Response body sent from the server or loaded from the browser cache. This
   * field is populated with textual content only. The text field is either HTTP
   * decoded text or a encoded (e.g. "base64") representation of the response
   * body. Leave out this field if the information is not available.
   */
  private String text;
  /**
   * Encoding used for response text field e.g "base64". Leave out this field if
   * the text field is HTTP decoded (decompressed & unchunked), than trans-coded
   * from its original character set into UTF-8.
   */
  private String encoding;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;
}
