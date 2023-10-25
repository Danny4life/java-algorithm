package tutorial;

public class ThreadEx4 extends Thread{

    public void run(){
        for(int i = 1; i < 5; i++){
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadEx4 t1 = new ThreadEx4();
        ThreadEx4 t2 = new ThreadEx4();

        t1.start();
        t2.start();
    }
}
