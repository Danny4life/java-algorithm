package string_methods;

public class CharAtEx {

    public static void main(String[] args) {
        String name = "segun";
        char c = name.charAt(3);

        System.out.println(c);

        String fullname = "segunosiki";
        //int l = fullname.length();

        System.out.println("first character " + fullname.charAt(0));
        System.out.println("last character " + fullname.charAt(fullname.length() - 1));
        System.out.println(fullname.length());

        System.out.println("***************************");

        // print character at odd positions using chatAt
        String str = "welcome to this portal";

        System.out.println(str.length());

        for(int i = 0; i <= str.length() - 1; i++){
            if(i%2 == 0){
                System.out.println("Char at " + i + " place " + str.charAt(i));
            }
        }

        System.out.println("*******************");
        // counting frequency of a character in string
        String strFreq = "welcome to the javatpoint";
        int count = 0;

        for(int i = 0; i <= strFreq.length() - 1; i++){
            if(strFreq.charAt(i) == 't'){
                count++;

            }

        }
        System.out.println("the number of char is " + count);



    }
}
