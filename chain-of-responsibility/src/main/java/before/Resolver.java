package before;

import before.Issue.IssueType;

public interface Resolver {

  Resolver setNext(Resolver resolver);

  void process(Issue issue);

  IssueType[] canProcess();
}
