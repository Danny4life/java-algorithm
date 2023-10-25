package tutorial;

public class ThreadEx5 extends Thread{

    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        ThreadEx5 t1 = new ThreadEx5();
        ThreadEx5 t2 = new ThreadEx5();

        System.out.println("name of t1 " + t1.getName());
        System.out.println("name of t2 " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("john doe");
        System.out.println("after changing t1 name is " + t1.getName());
    }
}
