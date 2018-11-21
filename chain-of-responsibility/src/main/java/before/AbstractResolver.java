package before;

import before.Issue.IssueType;
import java.util.Arrays;

public abstract class AbstractResolver implements Resolver {

  private Resolver next;

  public AbstractResolver() {}

  @Override
  public Resolver setNext(Resolver next) {
    this.next = next;
    return next;
  }

  public void process(Issue issue) {
    if (Arrays.stream(canProcess()).anyMatch(issue.getType()::equals)) {
      processInternal(issue);
    }
    if (this.next != null) {
      this.next.process(issue);
    }
  }

  protected abstract void processInternal(Issue issue);

  public abstract IssueType[] canProcess();
}
