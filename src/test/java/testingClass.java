import org.junit.Assert;
import org.junit.Test;

public class testingClass {
    @Test
    public void should_return_helloworld(){
        Client.write();

        Assert.assertEquals("Hello World !",Server.readFile());
    }
}
