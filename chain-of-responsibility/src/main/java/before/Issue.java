package before;

public class Issue {

  public enum IssueType {
    FRONTEND,
    GDH,
    DATA_EXTRACT,
    VALUE_ASSESSMENT,
    BACKEND_IMPORTANT
  }

  private Long id;
  private IssueType type;

  public Issue(Long id, IssueType type) {
    this.id = id;
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public IssueType getType() {
    return type;
  }
}
