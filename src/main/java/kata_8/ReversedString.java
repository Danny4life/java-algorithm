package kata_8;

//Complete the solution so that it reverses the string passed into it.
//
//        'world'  =>  'dlrow'
//        'word'   =>  'drow'

public class ReversedString {

    public static void main(String[] args) {
        System.out.println(solution("word"));
    }

    public static String solution(String str) {
        // Solution 1
//        String rev = new StringBuilder(str).reverse().toString();
//        return rev;



        // Solution 2
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev += str.toCharArray()[i];
        }

        return rev;
    }
}
