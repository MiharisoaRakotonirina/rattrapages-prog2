import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;
import org.ngl.com.AnonymousUser;
import org.ngl.com.Message;
import org.ngl.com.Publication;
import org.ngl.com.RegisteredUser;

public class AddMessageToPublicationTest {
    @Test
    public void testAddMessagesToPublication() {   
        RegisteredUser registeredUser = new RegisteredUser();
        registeredUser.userID = "reg123";
        registeredUser.firstName = "Alice";
        registeredUser.lastName = "Smith";
        registeredUser.email = "alice@example.com";

        AnonymousUser anonymousUser = new AnonymousUser();
        anonymousUser.userID = "anon456";

        Publication publication = new Publication();
        publication.setPublicationId("pub002");
        publication.setOwner(registeredUser);

        Message firstMessage = new Message();
        firstMessage.messageContent = "Hello from registeredUser!";
        firstMessage.creationDateTime = LocalDateTime.now();
        firstMessage.isConfidential = false;
        firstMessage.author = registeredUser;

        Message secondMessage = new Message();
        secondMessage.messageContent = "Anonymous message from anonymousUser.";
        secondMessage.creationDateTime = LocalDateTime.now();
        secondMessage.isConfidential = true;
        secondMessage.author = anonymousUser;

        publication.addMessage(firstMessage);
        publication.addMessage(secondMessage);

        assertEquals(2, publication.getMessages().size());
        assertEquals(registeredUser, publication.getMessages().get(0).author);
        assertEquals(anonymousUser, publication.getMessages().get(1).author);
    }
}
