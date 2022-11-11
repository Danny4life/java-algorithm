package kata_8;

//Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

public class RemoveExclamationMark {

    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("!He!llo World!"));
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}
