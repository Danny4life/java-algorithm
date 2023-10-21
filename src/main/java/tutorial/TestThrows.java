package tutorial;

public class TestThrows {

    public static int divideNum(int m, int n){

        return m / n;
    }

    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            System.out.println(divideNum(45,0));
        } catch (ArithmeticException e) {
            System.out.println("\nNumber cannot be divided by 0");
        }
        System.out.println("Rest of the code..");
    }
}
