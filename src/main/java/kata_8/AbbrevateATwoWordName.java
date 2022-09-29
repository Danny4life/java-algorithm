package kata_8;

//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//        The output should be two capital letters with a dot separating them.
//
//        It should look like this:
//
//        Sam Harris => S.H
//
//        patrick feeney => P.F

//get the first character of both first and last name in the string
// make them uppercase
//put a dot in between the abbreviation

public class AbbrevateATwoWordName {

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }

    public static String abbrevName(String name) {

        String[] splitStr = name.split(" ");


        return (splitStr[0].charAt(0) + "." + splitStr[1].charAt(0)).toUpperCase();

    }
}
