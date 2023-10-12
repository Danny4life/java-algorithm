package tutorial;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStr("hello"));

    }

    public static String reverseStr(String str){

        char[] ch = str.toCharArray();

        String rev = "";

        for(int i = ch.length - 1; i >= 0; i--){
            rev += ch[i];
        }

        return rev;



    }
}
