package creational.pattern.abstractFactory;

public class DatabaseService implements Service{
    @Override
    public String runService() {
        return "Database service running";
    }
}
