package structural.pattern.facade;

public class NetworkAccessFacade {

    private Communication communication = new Communication();
    private Cache cache = new Cache();
    private Interceptor interceptor = new Interceptor();
    private Convertor convertor = new Convertor();

    public void communicate() {
        cache.checkCache();
        communication.send("Some data");
        communication.receive();
        interceptor.intercept();
        convertor.convert();
    }
}
