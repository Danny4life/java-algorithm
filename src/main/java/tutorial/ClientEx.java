package tutorial;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientEx {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dous = new DataOutputStream(s.getOutputStream());
            dous.writeUTF("Hello server");
            dous.flush();
            dous.close();
            s.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
