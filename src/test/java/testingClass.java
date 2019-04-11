import org.junit.Assert;
import org.junit.Test;

public class testingClass {
    @Test
    public void should_return_helloworld(){
        Client client = new Client();
        client.run();

        Client client2 = new Client();
        client2.run();

        Server server = new Server();
        server.run();
        server.run();
        Assert.assertEquals("Hello World !",server.getValue());

    }
}
