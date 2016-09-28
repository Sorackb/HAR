package lucassouza.org.har.model.vo;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class Param {

  /**
   * name of a posted parameter.
   */
  private String name;
  /**
   * value of a posted parameter or content of a posted file.
   */
  private String value;
  /**
   * name of a posted file.
   */
  private String fileName;
  /**
   * content type of a posted file.
   */
  private String contentType;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;
}
