package kata_8;

//Your friend has been out shopping for puppies (what a time to be alive!)...
//        He arrives back with multiple dogs, and you simply do not know how to respond!
//
//        By repairing the function provided, you will find out exactly how you should respond,
//        depending on the number of dogs he has.
//
//        The number of dogs will always be a number and there will always be at least 1 dog.
//
//        Good luck!

//public class SolutionTest {
//
//    @Test
//    public void basicTests() {
//        assertEquals("More than a handful!",ZywOo.howManyDalmatians(26));
//        assertEquals("Hardly any" ,ZywOo.howManyDalmatians(8));
//        assertEquals("More than a handful!" ,ZywOo.howManyDalmatians(14));
//        assertEquals("Woah that's a lot of dogs!" ,ZywOo.howManyDalmatians(80));
//        assertEquals("Woah that's a lot of dogs!" ,ZywOo.howManyDalmatians(100));
//        assertEquals("101 DALMATIANS!!!" ,ZywOo.howManyDalmatians(101));
//    }
//}

public class Damatians {

    public static void main(String[] args) {
        System.out.println();
    }

    public static String howManyDalmatians(int number) {

        //  String[] dogs {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};

//     String respond = number <= 10 ? dogs[0] (number <= 50 ? dogs[1] : (number = 101  dogs[3] : dogs[2]

//     return respond

        return number <= 10 ? "Hardly any" :
                number <= 50 ? "More than a handful!" :
                        number == 101 ? "101 DALMATIANS!!!" : "Woah that's a lot of dogs!";


    }
}
