package lucassouza.org.har.model.vo;

import java.util.List;

/**
 *
 * @author Lucas Souza [sorackb@gmail.com]
 */
public class PostData {

  /**
   * Mime type of posted data.
   */
  private String mimeType;
  /**
   * List of posted parameters (in case of URL encoded parameters).
   */
  private List<Param> params;
  /**
   * Plain text posted data
   */
  private String text;
  /**
   * A comment provided by the user or the application.
   */
  private String comment;
}
