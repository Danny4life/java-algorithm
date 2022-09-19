package kata_7;
//You have to write a calculator that receives strings for input. The dots will represent the number in the equation.
//        There will be dots on one side, an operator, and dots again after the operator. The dots and the operator will
//        be separated by one space.
//
//        Here are the following valid operators :
//
//        + Addition
//        - Subtraction
//        * Multiplication
//// Integer Division
//        Your Work (Task)
//        You'll have to return a string that contains dots, as many the equation returns. If the result is 0,
//        return the empty string. When it comes to subtraction, the first number will always be greater than or
//        equal to the second number.
//
//        Examples (Input => Output)
//        * "..... + ..............." => "...................."
//        * "..... - ..."             => ".."
//        * "..... - ."               => "...."
//        * "..... * ..."             => "..............."
//        * "..... * .."              => ".........."
//        * "..... // .."             => ".."
//        * "..... // ."              => "....."
//        * ". // .."                 => ""
//        * ".. - .."                 => ""
// 5 / 1

public class DotCalculator {
    public static void main(String[] args){
        System.out.println(calc("..... // ."));
    }

    public static String calc(String txt) {
        //Code here

        String[] array = txt.split(" ");
        int a = array[0].length();
        int b = array[2].length();
        int total = 0;

        if(txt.contains("+")) total += a + b;
        if(txt.contains("-")) total += a - b;
        if(txt.contains("*")) total += a * b;
        if(txt.contains("//")) total += Math.floor(a / b);

        String  result = "";

        while(total > 0){
            result += ".";

            total--;
        }

        return result;
    }
}
