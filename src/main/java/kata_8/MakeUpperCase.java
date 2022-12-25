package kata_8;

//Write a function which converts the input string to uppercase.

public class MakeUpperCase {
    public static void main(String[] args) {
        System.out.println(MakeUpperCase("hello"));
    }

    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
}
