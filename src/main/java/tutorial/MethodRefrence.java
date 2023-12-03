package tutorial;

public class MethodRefrence {
    public static void saySomething(){
        System.out.println("Hello, this is a static method");
    }

    public static void main(String[] args) {
        SayAble sayAble = MethodRefrence::saySomething;

        sayAble.say();
    }
}
