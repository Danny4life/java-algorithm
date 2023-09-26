package tutorial;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int number = 12345678;
        int reverse = 0;

        for(int i = number; i != 0; i = i / 10){
            int remainder = i % 10;

            reverse = reverse * 10 + remainder;
        }

        System.out.println(reverse);
        System.out.println(1234567 % 10);

    }



}
