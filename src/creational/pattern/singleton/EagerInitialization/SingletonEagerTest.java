package creational.pattern.singleton.EagerInitialization;

public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager SingletonEagerInstance1 = SingletonEager.getSingletonEagerInstance();
        SingletonEager SingletonEagerInstance2 = SingletonEager.getSingletonEagerInstance();

        // the address of two instance should be identical
        System.out.println(SingletonEagerInstance1);
        System.out.println(SingletonEagerInstance2);

    }
}
