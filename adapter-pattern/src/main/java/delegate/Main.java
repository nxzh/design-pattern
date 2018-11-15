package delegate;

public class Main {

  public static void useV2Api(V2Api v2Api) {
    v2Api.init();
    v2Api.destroy();
  }

  public static void main(String[] args) {
    useV2Api(new V1ToV2ApiAdapter(new V1ApiImpl()));
  }
}
