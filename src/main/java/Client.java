import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Client {
    public static void write(){
        String helloWorld = "Hello World !";
        File file = new File("C:\\Test\\testText.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(helloWorld);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
