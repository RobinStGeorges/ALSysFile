import java.io.*;

public class Server extends Thread {
    public String value;

    public void run(){
        File file = new File("C:\\test\\testText.txt");
        String line = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                value=line;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(){
        return value;
    }

    public static String readFile(){
        File file = new File("C:\\test\\testText.txt");
        String line = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                return line;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
