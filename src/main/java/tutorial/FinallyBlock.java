package tutorial;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int data = 25/5;
            System.out.println(data);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
        }
        finally {
            System.out.println("Hush and Execute");
        }
        System.out.println("Rest of the code");
    }
}
