package tutorial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";
            String str2 = "";

            while(!str.equals("stop")){
                str = dis.readUTF();
                System.out.println("Client says: " + str);
                str2 = br.readLine();
                dout.writeUTF(str2);
                dout.flush();

            }
            dis.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
