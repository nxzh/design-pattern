package before;

import before.Issue.IssueType;

public class Sid extends AbstractResolver {

  @Override
  protected void processInternal(Issue issue) {
    System.out.println(String.format("Sid is resolving Issue: %d", issue.getId()));
  }

  @Override
  public IssueType[] canProcess() {
    return new IssueType[] {IssueType.BACKEND_IMPORTANT};
  }
}
