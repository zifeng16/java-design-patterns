package creational.pattern.singleton.LazyInitialization;

public class SingletonLazyTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingletonInstance();
        Singleton singleton2 = Singleton.getSingletonInstance();

        System.out.println(singleton1);
        System.out.println(singleton1);
    }
}
