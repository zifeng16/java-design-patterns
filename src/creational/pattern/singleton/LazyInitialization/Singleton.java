package creational.pattern.singleton.LazyInitialization;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {}

    // 非线程安全，加上线程锁保证线程安全
    public static synchronized Singleton getSingletonInstance() {
        // Check the instance has been instantiated
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

}
