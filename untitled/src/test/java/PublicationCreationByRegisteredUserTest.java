import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.ngl.com.Publication;
import org.ngl.com.RegisteredUser;

public class PublicationCreationByRegisteredUserTest {

    @Test
    public void testPublicationCreationByRegisteredUser() {
        RegisteredUser user = new RegisteredUser();
        user.userID = "reg123";
        user.firstName = "Alice";
        user.lastName = "Smith";
        user.email = "alice@example.com";

        Publication publication = new Publication();
        publication.setPublicationId("pub001");
        publication.setOwner(user);

        assertEquals("pub001", publication.getPublicationId());
        assertEquals(user, publication.getOwner());
    }
}
