package kata_8;

//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

public class SimpleMultiplication {

    public static void main(String[] args) {
        System.out.println(simpleMultiplication(1));
    }

    public static int simpleMultiplication(int n) {

//        if(n  % 2 == 0){
//            return n * 8;
//        }
//
//        return n * 9;

        return n % 2 == 0 ? n * 8 : n * 9;
    }
}
