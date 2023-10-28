package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx2 {
    public static void main(String[] args) {

        // Get the user's home directory
        String userHome = System.getProperty("user.home");

        // Construct the path to the desktop directory
        String desktopPath = userHome + "/Desktop/testing.txt";


        try{
            FileOutputStream out = new FileOutputStream(desktopPath);
            String s = "this is a another string";
            byte[] b = s.getBytes();

            out.write(b);
            out.close();
            System.out.println("success...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
