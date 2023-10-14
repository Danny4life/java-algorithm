package string_methods;

public class ConcatEx {
    public static void main(String[] args) {
        String s1 = "javapoint";
        String s2 = "reader";
        String s3 = "are good";

        String s4 = s1.concat(" ").concat(s2);
        String s5 = s1.concat(" ").concat(s2).concat(" ").concat(s3);

        System.out.println(s4);
        System.out.println(s5);
    }
}
