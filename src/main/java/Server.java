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
                if(line.equals("Hello World !")){
                    try {
                        FileWriter fw = new FileWriter(file);
                        fw.write("Code : 200");
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
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
