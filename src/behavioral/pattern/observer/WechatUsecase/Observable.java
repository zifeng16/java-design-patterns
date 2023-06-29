package behavioral.pattern.observer.WechatUsecase;

public interface Observable {
    void add(Observer observer);
    void delete(Observer observer);
    void notify(String message);
}
