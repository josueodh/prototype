import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void itShouldBeCloneClient() throws CloneNotSupportedException{
        Client client = new Client("Lorem", "lorem@example.com", new Date(1998, 5, 13), "(32) 99999-9999", new Nps(10));

        Client clientClone = client.clone();
        clientClone.setEmail("ipsum@example.com");
        clientClone.setName("Lorem Ipsum");
        clientClone.getNps().setNps(8);

        assertEquals( "Name: " + "Lorem" + '\'' + "Email: " + "lorem@example.com" + '\'' + "Phone: " + "(32) 99999-9999" + '\'' + "Born Date: " + new Date(1998, 5, 13) +  '\'' + "NPS: " + "10",client.toString() );
        assertEquals( "Name: " + "Lorem Ipsum" + '\'' + "Email: " + "ipsum@example.com" + '\'' + "Phone: " + "(32) 99999-9999" + '\'' + "Born Date: " + new Date(1998, 5, 13) +  '\'' + "NPS: " + "8",clientClone.toString() );

    }


}