package before;

import before.Issue.IssueType;

public class Kevin extends AbstractResolver {

  @Override
  protected void processInternal(Issue issue) {
    System.out.println(String.format("Kevin is resolving Issue: %d", issue.getId()));
  }

  @Override
  public IssueType[] canProcess() {
    return new IssueType[] {IssueType.DATA_EXTRACT, IssueType.BACKEND_IMPORTANT};
  }
}
