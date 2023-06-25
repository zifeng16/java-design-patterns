package creational.pattern.singleton.StaticBlockInitialization;

public class SingletonStaticBlock {
    private static SingletonStaticBlock singletonStaticBlockInstance;

    static {
        singletonStaticBlockInstance = new SingletonStaticBlock();
    }

    // private constructor
    private SingletonStaticBlock() {}

    // Getter to retrieve the instance
    public static SingletonStaticBlock getSingletonStaticBlockInstance() {
        return singletonStaticBlockInstance;
    }
}
