package tutorial;

public class Counter {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " world";


        String s = String.join("", s1,s2);

        System.out.println(s.toString());

    }
}
