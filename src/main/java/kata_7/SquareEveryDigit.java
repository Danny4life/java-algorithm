package kata_7;

//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//        For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//        Note: The function accepts an integer and returns an integer

//run a for loop
// square each digit after the loop
// concatenate them



public class SquareEveryDigit {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        // TODO Implement me

       String strDig = String.valueOf(n);
       String result = "";

       for(char c : strDig.toCharArray()){
           int digit = Character.digit(c, 10);
           result += digit * digit;
       }

       return Integer.parseInt(result);
    }

}
