package behavioral.pattern.observer;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();

        editor.eventManager.subscribe("open", emailNotificationListener);
        editor.eventManager.subscribe("save", emailNotificationListener);

        editor.eventManager.subscribe("open", logOpenListener);

        editor.openFile("test.jpg");
        editor.saveFile();

        System.out.println("");

        editor.eventManager.unsubscribe("save", emailNotificationListener);
        editor.openFile("test.jpg");
        editor.saveFile();
    }
}
