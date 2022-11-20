package kata_8;

//Given an array of 3 non-negative integers a, b and c, determine if they form a pythagorean triple.
//
//        A pythagorean triple is formed when:
//
//        c2 = a2 + b2
//        where c is the largest value of a, b, c.
//
//        For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 52 = 32 + 42
//
//        Return Values
//        1 if a, b and c form a pythagorean triple
//        0 if a, b and c do not form a pythagorean triple
//        For Python: return True or False
//        For JavaScript: return true or false

public class Pythagorean {

    public static void main(String[] args) {
        System.out.println(pythagoreanTriple(new int[] {3,4,7}));
    }

    public static int pythagoreanTriple(int[] triple){

       int a2 = triple[0] * triple[0];
       int b2 = triple[1] * triple[1];
       int c2 = triple[2] * triple[2];

       if(a2 + b2 == c2){
           return 1;
       } else {
           return 0;
       }


    }
}
