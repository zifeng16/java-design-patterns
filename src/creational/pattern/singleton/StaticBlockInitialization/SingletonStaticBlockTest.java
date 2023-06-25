package creational.pattern.singleton.StaticBlockInitialization;

public class SingletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock singletonStaticBlock1 = SingletonStaticBlock.getSingletonStaticBlockInstance();
        SingletonStaticBlock singletonStaticBlock2 = SingletonStaticBlock.getSingletonStaticBlockInstance();

        // the address of two instance should be identical
        System.out.println(singletonStaticBlock1);
        System.out.println(singletonStaticBlock2);
    }
}
