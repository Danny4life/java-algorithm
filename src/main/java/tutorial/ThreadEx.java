package tutorial;

public class ThreadEx extends Thread{



    public void run(){
        System.out.println("thread is running 1");
    }

    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx();
        t1.start();
    }
}
