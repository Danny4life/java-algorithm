package kata_8;

//Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.


public class ConvertBooleanToString {

    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }

    public static String boolToWord(boolean b)
    {
        if(b == true){
            return "Yes";
        }
        return "No";
    }
}
