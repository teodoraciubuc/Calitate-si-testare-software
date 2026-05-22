package observer.antivirus;

public interface HttpCall {
    String get(String url);
    boolean ping(String url);
}
