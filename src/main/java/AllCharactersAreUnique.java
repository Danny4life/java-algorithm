import java.util.HashSet;

public class AllCharactersAreUnique {

    public static void main(String[] args) {// test your code here
        System.out.println(hasUniqueChar("abcdefg"));
    }

    public static boolean hasUniqueChar(String str) {
        HashSet <Character>charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                return false; // Character already exists in the set
            }
        }
        return true; // All characters are unique
    }

}
