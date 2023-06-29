package behavioral.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Group chat usecase
 */
public class Mediator {
    List<ChatUser> chatUsers = new ArrayList<>();

    public Mediator addUser(ChatUser chatUser) {
        chatUsers.add(chatUser);
        return this;
    }

    public void sendMessage(String message, ChatUser source) {
        for (ChatUser chatUser : chatUsers) {
            if (chatUser != source) {
                chatUser.receiveMessage(message);
            }
        }
    }
}
