package structural.pattern.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("test.png");

        image.display();
        System.out.println("");
        image.display(); // will not loading in RealImage
    }
}
