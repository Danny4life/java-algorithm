package kata_8;

//Complete the function which converts hex number (given as a string) to a decimal number.



public class HexToDecimal {

    public static void main(String[] args) {
        System.out.println(hexToDec("a"));
    }

    public static int hexToDec(final String hexString) {
        // Your code here
        return Integer.parseInt(hexString, 16);
    }
}
