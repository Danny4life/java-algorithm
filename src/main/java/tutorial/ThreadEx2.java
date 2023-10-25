package tutorial;

public class ThreadEx2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running 2");
    }

    public static void main(String[] args) {
        ThreadEx2 t2 = new ThreadEx2();
        Thread m1 = new Thread(t2);

        m1.start();
    }
}
