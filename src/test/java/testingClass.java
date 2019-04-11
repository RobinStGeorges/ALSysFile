import org.junit.Assert;
import org.junit.Test;

public class testingClass {
    @Test
    public void should_return_helloworld(){
        Client.write();
        Server server = new Server();
        server.run();
        server.run();
        Assert.assertEquals("Hello World !",server.getValue());
    }
}
