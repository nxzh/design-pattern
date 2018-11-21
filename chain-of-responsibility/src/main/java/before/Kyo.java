package before;

import before.Issue.IssueType;

public class Kyo extends AbstractResolver {

  protected void processInternal(Issue issue) {
    System.out.println(String.format("Kyo is resolving Issue: %d", issue.getId()));
  }

  @Override
  public IssueType[] canProcess() {
    return new IssueType[] {IssueType.FRONTEND};
  }
}
