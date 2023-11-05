package tutorial;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientEx {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 6666);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dous = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";
            String str2 = "";

            while(!str.equals("stop")){
                str = br.readLine();
                dous.writeUTF(str);
                dous.flush();

                str2 = din.readUTF();
                System.out.println("Server says: " + str2);
            }

            dous.close();
            s.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
