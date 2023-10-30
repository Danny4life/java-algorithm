package tutorial;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File file = new File("file123.txt");
            if(file.createNewFile()){
                System.out.println("new file created");
            }else{
                System.out.println("file already exits");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
