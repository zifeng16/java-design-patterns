package structural.pattern.bridge;

public class Facebook implements App {
    private PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        System.out.println("");
        os.upload("Facebook data upload");
        os.download("Facebook.com");
        os.display("Facebook data");
        System.out.println("");
    }
}
