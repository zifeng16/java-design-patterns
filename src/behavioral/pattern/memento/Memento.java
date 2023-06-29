package behavioral.pattern.memento;

/**
 *  在不破坏封装的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态
 *  这样以后就可以将该对象恢复到原先保存的状态
 *
 *  备忘录：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人
 */
public class Memento {
    String state;

    public Memento(String state) {
        this.state = state;
    }
}
