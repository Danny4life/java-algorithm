package tutorial;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEx {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("test.txt");
            fw.write("I love JAVA");
            fw.close();
        } catch (IOException e) {
            System.out.println("done");
        }
    }
}
