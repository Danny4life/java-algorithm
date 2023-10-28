package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx1 {
    public static void main(String[] args) {

        // Get the user's home directory
        String userHome = System.getProperty("user.home");

        // Construct the path to the desktop directory
        String desktopPath = userHome + "/Desktop/testing.txt";

        try{
            FileInputStream in = new FileInputStream(desktopPath);
           int i = 0;
           while((i = in.read()) != -1){
               System.out.println((char)i);
           }


            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
