package kata_7;

//Imagine circle
//        then split into the length of string parts
//        for example we want to encode "codewars"
//        split into eight becasue codewars has eight charsadd lettersremove circleread it left to right
//        output is csordaew
//
//        decoding is almost same
//
//        take csordaew return codewars


//1 split into length of string parts
// 2. add characters
//3. read left to right

public class Cipher_Cipher {

    public static void main(String[] args) {
        System.out.println(encode("codewars"));
      System.out.println(decode("csordaew"));
    }

    public static String encode(String s) {

       StringBuilder res = new StringBuilder();

       for(int i = 0; i < s.length(); i++){
           res.append(s.charAt(i % 2 == 0 ? i / 2 : s.length() - i / 2 - 1));
       }

        return res.toString();

    }
    public static String decode(String s) {

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == s.length() % 2){
                res.append(s.charAt(s.length() -1 - i));
            }else {
                res.insert(0, s.charAt(s.length() - 1- i));
            }
        }
        return res.toString();
    }
}
