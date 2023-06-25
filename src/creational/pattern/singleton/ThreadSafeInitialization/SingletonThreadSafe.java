package creational.pattern.singleton.ThreadSafeInitialization;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe(){}

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
