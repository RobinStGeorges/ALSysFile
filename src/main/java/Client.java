import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Client extends Thread {

    public void run(){
        String helloWorld = "Hello World !";

        boolean success = (new File("C:\\test")).mkdirs();
        if (!success) {
            // Directory creation failed
        }

        File file = new File("C:\\test\\testText.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(helloWorld);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(){
        String helloWorld = "Hello World !";

        boolean success = (new File("C:\\test")).mkdirs();
        if (!success) {
            // Directory creation failed
        }

        File file = new File("C:\\test\\testText.txt");
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
