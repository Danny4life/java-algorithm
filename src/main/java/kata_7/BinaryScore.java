package kata_7;

//Objective
//        Given a number n we will define its scORe to be 0 | 1 | 2 | 3 | ... | n,
//        where | is the bitwise OR operator.
//
//        Write a function that takes n and finds it's scORe.
//
//        n	scORe n
//        0	0
//        1	1
//        49	63
//        1000000	1048575
//        Any feedback would be much appreciated

//@Test
//public void basicTests () {
//        tester(new BigInteger("0"), new BigInteger("0"));
//        tester(new BigInteger("1"), new BigInteger("1"));
//        tester(new BigInteger("49"), new BigInteger("63"));
//        tester(new BigInteger("1000000"), new BigInteger("1048575"));
//        tester(new BigInteger("10000000"), new BigInteger("16777215"));
//        }
//        }

import java.math.BigInteger;

public class BinaryScore {

    public static void main(String[] args) {
        System.out.println(score(new BigInteger("10000000")));
    }

    public static BigInteger score (BigInteger n) {
        BigInteger result = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;

        for(BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(one)) {
            result = result.or(i);
        }

        return result;
    }
}
