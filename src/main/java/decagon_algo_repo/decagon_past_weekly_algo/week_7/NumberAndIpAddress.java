package decagon_algo_repo.decagon_past_weekly_algo.week_7;

// given already
//Task
//        An IP address contains four numbers(0-255) and separated by dots.
//        It can be converted to a number by this way:
//
//        Given a string s represents a number or an IP address.
//        Your task is to convert it to another representation(number to IP address or IP address to number).
//
//        You can assume that all inputs are valid.
//
//        Example
//        Example IP address: 10.0.3.193
//
//        Convert each number to a 8-bit binary string (may needs to pad leading zeros to the left side):
//
//        10  -->  00001010
//        0   -->  00000000
//        3   -->  00000011
//        193 -->  11000001
//        Combine these four strings: 00001010 00000000 00000011 11000001 and then
//        convert them to a decimal number: 167773121
//
//        Input/Output
//        [input] string s
//
//        A number or IP address in string format.
//
//        [output] a string
//
//        A converted number or IP address in string format.
//
//        Example
//        For s = "10.0.3.193", the output should be "167773121".
//
//        For s = "167969729", the output should be "10.3.3.193".
//
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//
//public class NumberAndIPAddressTest {
//
//    @Test
//    public void numberAndIPaddress() throws Exception {
//        assertEquals( "167773121", NumberAndIPAddress.numberAndIPaddress( "10.0.3.193" ) );
//        assertEquals( "10.3.3.193", NumberAndIPAddress.numberAndIPaddress( "167969729" ) );
//    }
//
//}



public class NumberAndIpAddress {

    public static void main(String[] args) {
        System.out.println(numberAndIPaddress("10.0.3.193"));
    }
    public static String numberAndIPaddress(String s) {
        // if the input contains a dot, indicate it's an IP address
        if (s.contains(".")) {
            // If The input is an IP address, convert it to a number
            return convertIpsToNumber(s);
        } else {
            // The input is a number, convert it to an IP address
            return convertNumberToIpAddress(s);
        }
    }

    // Method to convert an IP address to a number
    private static String convertIpsToNumber(String ip) {
        // Split the IP address into its four parts using string split method
        String[] spiltParts = ip.split("\\.");
        // Initialize a variable to store the resulting number
        long resultingNum = 0;
        // loop through each part of the IP address
        for (int i = 0; i < spiltParts.length; i++) {
            // Convert each part to an integer and add it to the number
            resultingNum = resultingNum * 256 + Integer.parseInt(spiltParts[i]);
        }
        // Return the resulting number as a string
        return String.valueOf(resultingNum);
    }

    // Method to convert a number to an IP address
    private static String convertNumberToIpAddress(String number) {
        // Convert the input number from a string to a long
        long num = Long.parseLong(number);
        // Initialize a StringBuilder to create the IP address
        StringBuilder res = new StringBuilder();
        // Iterate through each of the four 8-bit segments of the number
        for (int i = 3; i >= 0; i--) {
            // Extract the 8-bit segment using bitwise >> operations
            long segment = (num >> (8 * i)) & 255;
            // Append the segment to the IP address
            res.append(segment);
            // Add a dot after each segment except the last one
            if (i > 0) {
                res.append(".");
            }
        }
        // Return the constructed IP address as a string
        return res.toString();
    }
}

// link : https://www.codewars.com/kata/5936371109ca68fe6900000c/train/java
