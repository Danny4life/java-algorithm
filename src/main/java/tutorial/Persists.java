package tutorial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persists {
    public static void main(String[] args) {
        try{
            SerializableEx s1 = new SerializableEx(1, "Joe");
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();

            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
