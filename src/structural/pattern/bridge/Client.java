package structural.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        App facebook = new Facebook(new IOS());
        App instagram = new Instagram(new Android());

        facebook.runApp();
        instagram.runApp();
    }
}
