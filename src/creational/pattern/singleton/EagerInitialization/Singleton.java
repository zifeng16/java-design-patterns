package creational.pattern.singleton.EagerInitialization;

public class Singleton {

    // As soon as the class is created, the instance is created
    private static Singleton singletonInstance = new Singleton();

    // private constructor
    private Singleton() {}

    // Getter to retrieve the instance
    public static Singleton getSingletonInstance() {
        return singletonInstance;
    }
}
