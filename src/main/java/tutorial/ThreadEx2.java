package tutorial;

public class ThreadEx2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running 2");
    }

    public static void main(String[] args) {
        ThreadEx2 t2 = new ThreadEx2();
        ThreadEx t1 = new ThreadEx();

        t1.start();
        t2.run();
    }
}
