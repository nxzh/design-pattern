package before;

import before.Issue.IssueType;

public class Bob extends AbstractResolver {

  @Override
  protected void processInternal(Issue issue) {
    System.out.println(String.format("Bob is resolving Issue: %d", issue.getId()));
  }

  @Override
  public IssueType[] canProcess() {
    return new IssueType[] {IssueType.VALUE_ASSESSMENT, IssueType.BACKEND_IMPORTANT};
  }
}
