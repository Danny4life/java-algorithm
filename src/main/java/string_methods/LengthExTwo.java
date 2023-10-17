package string_methods;

public class LengthExTwo {

    public static void main(String[] args) {
        String str = " this is java core ";

        int sizeWithWhiteSpaces = str.length();

        System.out.println(sizeWithWhiteSpaces);

        str = str.replace(" ","");

        int sizeWithoutWhiteSpace = str.length();

        System.out.println(sizeWithoutWhiteSpace);

        int noOfWhiteSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpace;

        System.out.println(noOfWhiteSpaces);
    }
}
