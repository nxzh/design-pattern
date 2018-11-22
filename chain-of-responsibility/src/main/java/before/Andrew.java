package before;

import before.Issue.IssueType;

public class Andrew extends AbstractResolver {

  protected void processInternal(Issue issue) {
    System.out.println(String.format("Andrew is resolving Issue: %d", issue.getId()));
  }

  @Override
  public IssueType[] canProcess() {
    return new IssueType[] {IssueType.GDH, IssueType.BACKEND_IMPORTANT};
  }
}
