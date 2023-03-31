package kata_7;
//
//Given a string s. You have to return another string such that even-indexed and odd-indexed
//        characters of s are grouped and groups are space-separated (see sample below)
//
//        Note:
//        0 is considered to be an even index.
//        All input strings are valid with no spaces
//        input: 'CodeWars'
//        output 'CdWr oeas'
//
//        S[0] = 'C'
//        S[1] = 'o'
//        S[2] = 'd'
//        S[3] = 'e'
//        S[4] = 'W'
//        S[5] = 'a'
//        S[6] = 'r'
//        S[7] = 's'
//        Even indices 0, 2, 4, 6, so we have 'CdWr' as the first group
//        odd ones are 1, 3, 5, 7, so the second group is 'oeas'
//        And the final string to return is 'Cdwr oeas'


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class OddEvenSortTest {
//
//    @Test
//    public void testSomething() {
//        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", OddEvenSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
//        assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", OddEvenSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
//        assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", OddEvenSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
//        assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", OddEvenSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
//        assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", OddEvenSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
//        assertEquals("SBEMTGYHC UDRAOLPI", OddEvenSort.sortMyString("SUBDERMATOGLYPHIC"));
//    }

//Pseudocode
//1. loop through the string
//2. get the even index of the string
//3. group them together
//4. get the odd index of the string
//5.group them together
//6. separate both and return the final string


import java.util.Arrays;

public class OddEvenSort {

    public static void main(String[] args) {

        System.out.println(sortMyString("Wolfeschlegelsteinhausenbergerdorff"));

    }

    public static String sortMyString(String s) {

        String[] str = s.split("");
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length; i++){
            if(i % 2 == 0){
                even.append(str[i]);
            }
            if(i % 2 == 1){
                odd.append(str[i]);

            }
            res = new StringBuilder(even + " " + odd);

        }
        return res.toString();
    }
}
