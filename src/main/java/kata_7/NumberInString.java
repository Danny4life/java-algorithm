package kata_7;

//In this Kata, you will be given a string that has lowercase letters and numbers.
//        Your task is to compare the number groupings and return the largest number.
//        Numbers will not have leading zeros.
//
//        For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.
//
//        Good luck!
//
//        Please also try Simple remove duplicates

//public class SolutionTest{
//    @Test
//    public void basicTests(){
//        assertEquals(9,Solution.solve("2ti9iei7qhr5"));
//        assertEquals(695,Solution.solve("gh12cdy695m1"));
//        assertEquals(85,Solution.solve("lu1j8qbbb85"));
//        assertEquals(185,Solution.solve("185lu1j8qbbb85"));
//    }
//}

// the task is to return the largest numbers in group

// steps
// split the string into number groups
// find the largest group number

public class NumberInString {

    public static void main(String[] args) {
        System.out.println(solve("185lu1j8qbbb8"));
    }

    public static int solve(String s){
        //..

        String[] groupNum = s.split("[a-zA-Z]+");


        int maxNum = 0;

        for(String num : groupNum){
            if(!num.isEmpty()){
                int number = Integer.parseInt(num);
                if(number > maxNum){
                    maxNum = number;
                }

            }
        }

        return maxNum;
    }
}
