package structural.pattern.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        System.out.println("Real image: loading file " + fileName);
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Real image: displaying image: " + fileName);
    }
}
