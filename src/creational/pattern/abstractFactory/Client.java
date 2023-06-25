package creational.pattern.abstractFactory;

public class Client {
    private Service service;
    private Response response;

    public Client(DataSourceAbstractFactory dataSourceAbstractFactory) {
        this.service = dataSourceAbstractFactory.createService();
        this.response = dataSourceAbstractFactory.createResponse();
    }

    public void communicate() {
        if (service != null && response != null) {
            System.out.println(service.runService());
            System.out.println(response.getResponse());
        }
    }
}
