package tutorial;

public class TestThrow {

    public static void checkNum(int num){
        if(num < 1){
            throw new ArithmeticException("\nNumber is negative, can not calculate square");
        }
        else {
            System.out.println("Square of " + num + " is" + (num * num));
        }
    }

    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        checkNum(2);

        System.out.println("Rest of code...");
    }
}


