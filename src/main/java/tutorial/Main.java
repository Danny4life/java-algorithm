package tutorial;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    static int a = 50;

    public static void main(String[] args) {

        /**
         * use switch statement to solve this challenge
         * create a program to check vowel or consonant
         * vowels are A, E, I, O, U
         */

      Address a1 = new Address("Benin", "Edo", "Nigeria");
      Address a2 = new Address("London", "London", "England");

      Employee e1 = new Employee(1, "Peter", a1);
      Employee e2 = new Employee(2, "Segun", a2);

      e1.display();
      e2.display();

    }



}
