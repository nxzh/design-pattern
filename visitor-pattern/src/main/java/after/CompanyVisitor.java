package after;

public interface CompanyVisitor {
  void visit(Person person);

  void visit(Department department);

  void visit(Company company);
}
