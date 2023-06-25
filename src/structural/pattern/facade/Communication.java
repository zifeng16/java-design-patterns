package structural.pattern.facade;

public class Communication {
    public void send(String data) {
        System.out.println("Sending data");
    }

    public void receive() {
        System.out.println("Receiving response");
    }
}
