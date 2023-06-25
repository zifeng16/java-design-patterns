package creational.pattern.singleton.EagerInitialization;

public class SingletonEager {

    // As soon as the class is created, the instance is created
    private static SingletonEager singletonEagerInstance = new SingletonEager();

    // private constructor
    private SingletonEager() {}

    // Getter to retrieve the instance
    public static SingletonEager getSingletonEagerInstance() {
        return singletonEagerInstance;
    }
}
