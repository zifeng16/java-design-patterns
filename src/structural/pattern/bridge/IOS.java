package structural.pattern.bridge;

public class IOS implements PhoneOS{
    @Override
    public void upload(String data) {
        System.out.println("iPhone uploading data: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("iPhone downloading url: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("iPhone displaying data: " + data);
    }
}
