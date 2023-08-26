package oop;

public class Main {

    public static void main(String[] args) {
        StudentA s2 = new StudentA();
        StudentA s3 = new StudentA();

        s2.id = 1;
        s2.name = "jane";

        s3.id = 2;
        s3.name = "john";

        System.out.println(s2.id);
        System.out.println(s2.name);

        System.out.println("**********************");

        System.out.println(s3.id);
        System.out.println(s3.name);
    }
}
