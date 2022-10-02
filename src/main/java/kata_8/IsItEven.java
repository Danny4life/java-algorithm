package kata_8;

//In this Kata we are passing a number (n) into a function.
//
//        Your code will determine if the number passed is even (or not).
//
//        The function needs to return either a true or false.
//
//        Numbers may be positive or negative, integers or floats.
//
//        Floats with decimal part non equal to zero are considered UNeven for this kata.



public class IsItEven {

    public static void main(String[] args) {
        System.out.println(isEven(1));
    }

    public static boolean isEven(double n) {
        // Your awesome code here!

//        if(n % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }

        return n % 2 == 0 ? true : false;
    }
}
