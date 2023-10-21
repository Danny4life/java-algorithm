package tutorial;

import java.io.IOException;

public class ThrowsExceptionEx {

    void m() throws IOException{
        throw new IOException("Device Error");
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("handled exception");
        }
    }

    public static void main(String[] args) {
        ThrowsExceptionEx op = new ThrowsExceptionEx();
        op.p();
        System.out.println("Normal flow...");
    }


}
