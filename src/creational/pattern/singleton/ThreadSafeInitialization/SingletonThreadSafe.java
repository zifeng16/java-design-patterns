package creational.pattern.singleton.ThreadSafeInitialization;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe(){}

    // double check lock
    public static SingletonThreadSafe getSingletonThreadSafe() {
        // Synchronized block
        synchronized (SingletonThreadSafe.class) {
            if (singletonThreadSafe == null) {
                singletonThreadSafe = new SingletonThreadSafe();
            }
        }

        return singletonThreadSafe;
    }
}
