package before;

import before.Issue.IssueType;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Issue> issues = new ArrayList<Issue>() {
          {
            add(new Issue(1L, IssueType.BACKEND_IMPORTANT));
            add(new Issue(2L, IssueType.GDH));
            add(new Issue(3L, IssueType.FRONTEND));
            add(new Issue(4L, IssueType.VALUE_ASSESSMENT));
            add(new Issue(5L, IssueType.DATA_EXTRACT));
          }
        };

    Resolver andrew = new Andrew();
    Resolver sid = new Sid();
    Resolver bob = new Bob();
    Resolver kevin = new Kevin();
    Resolver kyo = new Kyo();

    andrew.setNext(bob).setNext(kevin).setNext(sid).setNext(kyo);
    issues.forEach(andrew::process);
  }
}
