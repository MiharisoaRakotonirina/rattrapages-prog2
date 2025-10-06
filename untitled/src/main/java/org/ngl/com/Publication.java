package org.ngl.com;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publication {
    private String publicationId;
    private User owner;
    private List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void showAuthorMessage() {
        for (Message message : messages) {
            User user = message.getAuthor();
            if (user instanceof RegisteredUser) {
                RegisteredUser registeredUser = (RegisteredUser) user;
                System.out.println(registeredUser.getUserID() + " " + registeredUser.getLastName() + " " + registeredUser.getFirstName() + " " + registeredUser.getEmail());
            } else if (user instanceof AnonymousUser) {
                System.out.println(user.getUserID());
            }
        }
    }
}
