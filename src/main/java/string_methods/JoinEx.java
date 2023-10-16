package string_methods;

public class JoinEx {
    public static void main(String[] args) {
        String s = String.join("-", "welcome", "to", "java");
        String date = String.join("/", "10","10","2023");

        System.out.println(s);
        System.out.println(date);
    }
}
