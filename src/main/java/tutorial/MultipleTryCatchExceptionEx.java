package tutorial;

public class MultipleTryCatchExceptionEx {

    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayoutofbound exception occurs");
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception occurs");
        }
        catch (Exception e){
            System.out.println("Parent exception occurs");
        }

        System.out.println("Rest of the code");
    }
}
