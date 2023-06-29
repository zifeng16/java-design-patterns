package behavioral.pattern.observer.WechatUsecase;

import java.util.ArrayList;
import java.util.List;

public class PublicAccount implements Observable{

    private List<Observer> observerList = new ArrayList<>();

    public PublicAccount() {}

    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        observerList.forEach(observer -> observer.update(message));
    }
}
