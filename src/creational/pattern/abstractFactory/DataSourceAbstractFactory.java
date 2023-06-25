package creational.pattern.abstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
