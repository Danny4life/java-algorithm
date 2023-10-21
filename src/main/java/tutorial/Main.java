package tutorial;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TestCustomException obj = new TestCustomException();

        try{
            TestCustomException.validate(23);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");

            System.out.println("Exception occured " + ex);
        }

        System.out.println("Rest of the code...");
    }

}
