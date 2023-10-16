package string_methods;

public class Intern {
    public static void main(String[] args) {
        String s = new String("welcome").intern();
        String s2 = new String("welcome").intern();

        String s3 = "welcome";
        String s4 = "welcome";

        System.out.println(s == s2);
        System.out.println(s3 == s4);
    }
}
