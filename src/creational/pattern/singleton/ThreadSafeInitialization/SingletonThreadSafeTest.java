package creational.pattern.singleton.ThreadSafeInitialization;

public class SingletonThreadSafeTest {

    public static void main(String[] args) {
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getSingletonThreadSafe();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getSingletonThreadSafe();

        System.out.println(singletonThreadSafe1);
        System.out.println(singletonThreadSafe2);
    }
}
