package creational.pattern.abstractFactory;

public class DatabaseResponse implements Response {
    @Override
    public String getResponse() {
        return "Database response";
    }
}
