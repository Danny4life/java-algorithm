package kata_8;

//Now you have to write a function that takes an argument and returns the square of it.

public class SquaringAnArguement {

    public static void main(String[] args) {
        System.out.println(square(2));
    }

    public static int square(int n){
        //return (int) Math.pow(n, 2);
        return n * n;

    }
}
