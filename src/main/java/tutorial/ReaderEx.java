package tutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {
        try{
            Reader reader = new FileReader("output.txt");
            int data = reader.read();

            while(data != -1){
                System.out.println((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
