package string_methods;

public class CharArrayEx {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();

        System.out.println(ch);

        for(int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}
