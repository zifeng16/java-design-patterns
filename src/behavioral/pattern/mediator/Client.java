package behavioral.pattern.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ChatUser user1 = new ChatUser("User1", mediator);
        ChatUser user2 = new ChatUser("User2", mediator);
        ChatUser user3 = new ChatUser("User3", mediator);

        mediator.addUser(user1).addUser(user2).addUser(user3);
        user3.sendMessage("Hello everyone");
    }
}
