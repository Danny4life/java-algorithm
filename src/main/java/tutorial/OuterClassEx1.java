package tutorial;

public class OuterClassEx1 {
    private int data = 30;

    public class Inner{
        void msg(){
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        OuterClassEx1 out = new OuterClassEx1();
        OuterClassEx1.Inner in = out.new Inner();

        in.msg();
    }
}
