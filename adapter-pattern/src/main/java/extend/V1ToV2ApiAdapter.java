package extend;

public class V1ToV2ApiAdapter extends V1ApiImpl implements V2Api {

  public void init() {
    this.open();
    initialize();
  }

  public void destroy() {
    deInitializate();
    close();
  }
}
