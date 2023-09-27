package tutorial;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * use switch statement to solve this challenge
         * create a program to check vowel or consonant
         * vowels are A, E, I, O, U
         */

       Account a1 = new Account();
       a1.insert(2070300, "Segun", 500000);
       a1.display();
       a1.checkBalance();
       a1.deposit(40000);
       a1.checkBalance();
       a1.withdrawn(500000);
       a1.checkBalance();
       a1.withdrawn(100000);


    }



}
