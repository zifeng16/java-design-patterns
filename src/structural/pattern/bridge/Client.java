package structural.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        App facebook = new Facebook(new IOS());
        App instagram = new Instagram(new Android());
        App instagram2 = new Instagram(new IOS());

        facebook.runApp();
        instagram.runApp();
        instagram2.runApp();
    }
}
