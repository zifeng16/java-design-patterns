package creational.pattern.singleton.LazyInitialization;

public class SingletonLazy {

    private static SingletonLazy singletonLazyInstance;

    private SingletonLazy() {}

    public static SingletonLazy getSingletonLazyInstance() {
        // Check the instance has been instantiated
        if (singletonLazyInstance == null) {
            singletonLazyInstance = new SingletonLazy();
        }
        return singletonLazyInstance;
    }

}
