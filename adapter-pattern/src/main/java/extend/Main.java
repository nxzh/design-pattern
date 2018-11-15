package extend;

public class Main {

  public static void useV2Api(V2Api v2Api) {
    v2Api.init();
    v2Api.destroy();
  }

  public static void useV1Api(V1Api v1Api) {
    v1Api.open();
    v1Api.initialize();
    v1Api.deInitializate();
    v1Api.close();
  }

  public static void main(String[] args) {
    useV2Api(new V1ToV2ApiAdapter());
//    useV2Api(new V2Impl());
  }
}
