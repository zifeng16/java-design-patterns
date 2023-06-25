package creational.pattern.singleton.LazyInitialization;

public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy singletonLazy1 = SingletonLazy.getSingletonLazyInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getSingletonLazyInstance();

        System.out.println(singletonLazy1);
        System.out.println(singletonLazy1);
    }
}
