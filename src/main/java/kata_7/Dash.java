package kata_7;

//Write a function insert_dash(num) / insertDash(num) / InsertDash(int num) that will insert dashes ('-')
//        between each two odd digits in num. For example: if num is 454793 the output should be 4547-9-3.
//        Don't count zero as an odd digit.
//
//        Note that the number will always be non-negative (>= 0).

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void sampleTests() {
//        assertEquals("4547-9-3", Solution.insertDash(454793));
//        assertEquals("123456", Solution.insertDash(123456));
//        assertEquals("1003-567", Solution.insertDash(1003567));
//    }
//}

//Pseudocode
//--1. loop through the number
//--2. check if the number is even, if yes continue
//--3. check if the number before and after is odd, if yes insert a dash in between

public class Dash {
    public static void main(String[] args) {
        System.out.println(insertDash(454793));
    }

    public static String insertDash(int num) {
        // Your code here...

       String str = Integer.toString(num);
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < str.length(); i++){
           int digit = Character.getNumericValue(str.charAt(i));
           sb.append(digit);

           if(i < str.length() - 1){
               int nextDigit = Character.getNumericValue(str.charAt(i + 1));

               if(digit % 2 != 0 && nextDigit % 2 != 0){
                   sb.append("-");
               }
           }
       }
        return sb.toString();
    }
}
