package decagon_algo_repo.decagon_past_weekly_algo.week_10;

// given already
//You're given a string of length 12 or smaller, containing only digits. Write a function
//        that returns all the possible IP addresses that can be created by inserting three .s in the string.
//
//        An IP address is a sequence of four positive integers that are separated by .s,
//        where each individual integer is within the range 0 - 255, inclusive.
//
//        An IP address isn't valid if any of the individual integers contains leading 0s.
//        For example, "192.168.0.1" is a valid IP address, but "192.168.00.1" and "192.168.0.01" aren't,
//        because they contain "00" and 01, respectively. Another example of a valid IP address is "99.1.1.10";
//conversely, "991.1.1.0" isn't valid, because "991" is greater than 255.
//
//        Your function should return the IP addresses in string format and in no particular order.
//        If no valid IP addresses can be created from the string, your function should return an empty list.
//
//        Sample Input
//        string = "1921680"
//        Sample Output
//        [
//        "1.9.216.80",
//        "1.92.16.80",
//        "1.92.168.0",
//        "19.2.16.80",
//        "19.2.168.0",
//        "19.21.6.80",
//        "19.21.68.0",
//        "19.216.8.0",
//        "192.1.6.80",
//        "192.1.68.0",
//        "192.16.8.0"
//        ]
//// The IP addresses could be ordered differently.
//
//import java.util.*;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class ChallengeTest {
//    @Test
//    public void TestCase1() {
//        String input = "1921680";
//
//        ArrayList<String> expected = new ArrayList<String>() {{
//            add("1.9.216.80");
//            add("1.92.16.80");
//            add("1.92.168.0");
//            add("19.2.16.80");
//            add("19.2.168.0");
//            add("19.21.6.80");
//            add("19.21.68.0");
//            add("19.216.8.0");
//            add("192.1.6.80");
//            add("192.1.68.0");
//            add("192.16.8.0");
//        }};
//
//        var actual = new Challenge().validIPAddresses(input);
//        assertTrue(expected.equals(actual));
//    }
//    @Test
//    public void TestCase2() {
//        String input = "3700100";
//        ArrayList<String> expected = new ArrayList<String>(
//                Arrays.asList(
//                        "3.70.0.100",
//                        "37.0.0.100"
//                ));
//
//        var actual = new Challenge().validIPAddresses(input);
//        assertTrue(expected.equals(actual));
//    }
//    @Test
//    public void TestCase3() {
//        String input = "9743";
//        ArrayList<String> expected = new ArrayList<String>(
//                Arrays.asList(
//                        "9.7.4.3"
//                ));
//
//        var actual = new Challenge().validIPAddresses(input);
//        assertTrue(expected.equals(actual));
//    }
//    @Test
//    public void TestCase4() {
//        String input = "97430";
//        ArrayList<String> expected = new ArrayList<String>(
//                Arrays.asList(
//                        "9.7.4.30",
//                        "9.7.43.0",
//                        "9.74.3.0",
//                        "97.4.3.0"
//                ));
//
//        var actual = new Challenge().validIPAddresses(input);
//        assertTrue(expected.equals(actual));
//    }
//    @Test
//    public void TestCase5() {
//        String input = "997430";
//        ArrayList<String> expected = new ArrayList<String>(
//                Arrays.asList(
//                        "9.9.74.30",
//                        "9.97.4.30",
//                        "9.97.43.0",
//                        "99.7.4.30",
//                        "99.7.43.0",
//                        "99.74.3.0"
//                ));
//
//        var actual = new Challenge().validIPAddresses(input);
//        assertTrue(expected.equals(actual));
//    }
//}


import java.util.ArrayList;

public class ValidIpAddress {
    public static void main(String[] args) {
        System.out.println(validIPAddresses("1921680"));

    }

    public static ArrayList<String> validIPAddresses(String string) {
        // Initialize an ArrayList to store valid IP addresses found
        ArrayList<String> ipAddressesFound = new ArrayList<String>();

        // Iterate through the characters of the input string to generate possible IP addresses
        for (int i = 1; i < Math.min((int) string.length(), 4); i++) {
            // Initialize an array to store parts of the current IP address being generated
            String[] currentIPAddressParts = new String[] {"", "", "", ""};

            // Extract the first part of the IP address
            currentIPAddressParts[0] = string.substring(0, i);
            // Check if the first part is a valid IP address part
            if (!isValidPart(currentIPAddressParts[0])) {
                continue; // If not valid, skip to the next iteration
            }

            // Iterate through the characters starting from the second part of the IP address
            for (int j = i + 1; j < i + Math.min((int) string.length() - i, 4); j++) {
                // Extract the second part of the IP address
                currentIPAddressParts[1] = string.substring(i, j);
                // Check if the second part is a valid IP address part
                if (!isValidPart(currentIPAddressParts[1])) {
                    continue; // If not valid, skip to the next iteration
                }

                // Iterate through the characters starting from the third part of the IP address
                for (int k = j + 1; k < j + Math.min((int) string.length() - j, 4); k++) {
                    // Extract the third and fourth parts of the IP address
                    currentIPAddressParts[2] = string.substring(j, k);
                    currentIPAddressParts[3] = string.substring(k);

                    // Check if the third and fourth parts are valid IP address parts
                    if (isValidPart(currentIPAddressParts[2]) && isValidPart(currentIPAddressParts[3])) {
                        // If all parts are valid, join them and add the resulting IP address to the list
                        ipAddressesFound.add(join(currentIPAddressParts));
                    }
                }
            }
        }

        // Return the list of valid IP addresses found
        return ipAddressesFound;
    }

    // Method to check if a string represents a valid IP address part
    public static boolean isValidPart(String string) {
        // Convert the string to an integer
        int stringAsInt = Integer.parseInt(string);
        // Check if the integer is within the valid range for an IP address part
        if (stringAsInt > 255) {
            return false;
        }
        // Check if there are leading zeros in the string (invalid in an IP address)
        return string.length() == Integer.toString(stringAsInt).length();
    }

    // Method to join parts of an IP address into a single string
    public static String join(String[] strings) {
        // Initialize a StringBuilder to construct the IP address string
        StringBuilder sb = new StringBuilder();
        // Iterate through the parts of the IP address
        for (int l = 0; l < strings.length; l++) {
            // Append each part to the StringBuilder
            sb.append(strings[l]);
            // If it's not the last part, append a dot to separate parts
            if (l < strings.length - 1) {
                sb.append(".");
            }
        }
        // Return the constructed IP address string
        return sb.toString();
    }

}

