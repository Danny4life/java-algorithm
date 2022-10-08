package kata_7;

import java.util.Arrays;
import java.util.List;

//        a string strng
//        an array of strings arr
//        Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
//
//        a boolean true if all rotations of strng are included in arr
//        false otherwise
//        Examples:
//        contain_all_rots(
//        "bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true
//
//        contain_all_rots(
//        "Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"]) -> false)

public class AllInclusive {

    public static void main(String[] args) {
        System.out.println(containAllRots("bsjg", Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")));
    }


    public static boolean containAllRots(String strng, List<String> arr) {
        // your code

       for(int i = 0; i < strng.length(); i++){
           if(!arr.contains(strng)){
               return false;
           }
           strng = strng.substring(1) + strng.charAt(0);
       }

       return true;
    }
}
