package structural.pattern.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("test.png"); // proxy

        image.display(); // will load at the first time
        System.out.println("");
        image.display(); // will not load in RealImage
    }
}
