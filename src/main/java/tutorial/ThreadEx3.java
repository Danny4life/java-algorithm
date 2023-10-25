package tutorial;

public class ThreadEx3 {

    public static void main(String[] args) {
        Thread t = new Thread("My thread");

        t.start();

        String str = t.getName();

        System.out.println(str);
    }
}
