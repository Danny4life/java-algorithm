package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx1 {

    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\test.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
