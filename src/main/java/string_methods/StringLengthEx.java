package string_methods;

public class StringLengthEx {

    public static void main(String[] args) {
        String str = "Hello";

        int size = str.length();

        for(int i = 0; i < size; i++){
            System.out.println(str.charAt(str.length() - i - 1));
        }
    }
}
