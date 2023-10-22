package tutorial;

public class StaticClassEx {

    static int data = 50;

    static class Inner{
        void msg(){
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        StaticClassEx.Inner in = new Inner();

        in.msg();
    }
}
