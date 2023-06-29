package behavioral.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者：对备忘录进行管理，提供保存与获取备忘录的功能，但不能对备忘录的内容进行访问和修改
 */
public class CareTaker {
    List<Memento> mementoList = new ArrayList<>();

    public void saveState(Memento memento) {
        mementoList.add(memento);
    }

    public Memento restoreState(int index) {
        return mementoList.get(index);
    }
}
