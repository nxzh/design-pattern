package extend;

public class V1ApiImpl implements V1Api {


  public void open() {
    System.out.println("opening...");
  }

  public void initialize() {
    System.out.println("initializing...");
  }

  public void deInitializate() {
    System.out.println("deinitializing...");
  }

  public void close() {
    System.out.println("closing...");
  }
}
