package structural.pattern.proxy;

public class ImageProxy implements Image {
    private String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Image proxy: displaying " + fileName);
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("Image proxy: logging" + realImage);
    }
}
