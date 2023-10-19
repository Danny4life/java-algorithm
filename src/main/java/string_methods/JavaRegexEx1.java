package string_methods;

import java.util.regex.Pattern;

public class JavaRegexEx1 {
    public static void main(String[] args) {
       // System.out.println(Pattern.matches("..s", "as"));
       // System.out.println(Pattern.matches("[ams]?", "amsams"));
       // System.out.println(Pattern.matches("\\d", "4"));
        //System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "abB234aW"));
        System.out.println(Pattern.matches("[6789][0-9]{9}", "6926731072"));
    }
}
