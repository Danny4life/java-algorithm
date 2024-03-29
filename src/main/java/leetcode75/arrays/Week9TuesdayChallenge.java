package leetcode75.arrays;
import java.util.*;

public class Week9TuesdayChallenge {


    class Challenge {

        // O(1) time | O(1) space
        public ArrayList<String> validIPAddresses(String string) {
            ArrayList<String> ipAddressesFound = new ArrayList<String>();

            for (int i = 1; i < Math.min((int) string.length(), 4); i++) {
                String[] currentIPAddressParts = new String[] {"", "", "", ""};

                currentIPAddressParts[0] = string.substring(0, i);
                if (!isValidPart(currentIPAddressParts[0])) {
                    continue;
                }

                for (int j = i + 1; j < i + Math.min((int) string.length() - i, 4); j++) {
                    currentIPAddressParts[1] = string.substring(i, j);
                    if (!isValidPart(currentIPAddressParts[1])) {
                        continue;
                    }

                    for (int k = j + 1; k < j + Math.min((int) string.length() - j, 4); k++) {
                        currentIPAddressParts[2] = string.substring(j, k);
                        currentIPAddressParts[3] = string.substring(k);

                        if (isValidPart(currentIPAddressParts[2]) && isValidPart(currentIPAddressParts[3])) {
                            ipAddressesFound.add(join(currentIPAddressParts));
                        }
                    }
                }
            }

            return ipAddressesFound;
        }

        public boolean isValidPart(String string) {
            int stringAsInt = Integer.parseInt(string);
            if (stringAsInt > 255) {
                return false;
            }

            return string.length() == Integer.toString(stringAsInt).length(); // check for leading 0
        }

        public String join(String[] strings) {
            StringBuilder sb = new StringBuilder();
            for (int l = 0; l < strings.length; l++) {
                sb.append(strings[l]);
                if (l < strings.length - 1) {
                    sb.append(".");
                }
            }
            return sb.toString();
        }
    }
}
