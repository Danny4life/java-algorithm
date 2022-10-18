package kata_8;

//Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.
//
//        to_binary(1)  /* should return 1 */
//        to_binary(5)  /* should return 101 */
//        to_binary(11) /* should return 1011 */

public class ConvertToBinary {

    public static void main(String[] args) {
        System.out.println(toBinary(11));
    }

    public static int toBinary(int n) {

        String b = Integer.toBinaryString(n);

        int cb  = Integer.parseInt(b);
        return cb;
    }
}
