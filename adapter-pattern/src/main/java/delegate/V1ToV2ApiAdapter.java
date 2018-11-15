package delegate;

import java.io.Serializable;

public class V1ToV2ApiAdapter implements V2Api {

  private V1Api v1Api;

  public V1ToV2ApiAdapter(V1Api v1Api) {
    this.v1Api = v1Api;
  }

  public void init() {
    this.v1Api.open();
    this.v1Api.initialize();
  }

  public void destroy() {
    this.v1Api.deInitializate();
    this.v1Api.close();
  }
}
