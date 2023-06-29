package creational.pattern.singleton.EagerInitialization;

public class SingletonEagerTest {
    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getSingletonInstance();
        Singleton singletonInstance2 = Singleton.getSingletonInstance();

        // the address of two instance should be identical
        System.out.println(singletonInstance1);
        System.out.println(singletonInstance2);

    }
}
