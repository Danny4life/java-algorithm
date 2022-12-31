package kata_8;

//Who remembers back to their time in the schoolyard, when girls would take a flower
//        and tear its petals, saying each of the following phrases each time a petal was torn:
//
//        "I love you"
//        "a little"
//        "a lot"
//        "passionately"
//        "madly"
//        "not at all"
//        If there are more than 6 petals, you start over with "I love you" for 7 petals,
//        "a little" for 8 petals and so on.
//
//        When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
//
//        Your goal in this kata is to determine which phrase the girls would say at
//        the last petal for a flower of a given number of petals. The number of petals is always greater than 0.
//
//

//public class SampleTests {
//    @Test
//    public void test1() {
//        assertEquals("I love you", Sid.howMuchILoveYou(1));
//        assertEquals("a little", Sid.howMuchILoveYou(2));
//        assertEquals("not at all", Sid.howMuchILoveYou(6));
//    }
//}

//steps
//--if petal is equal to 1 return i love you, if 2 return a little, if 3 return a lot
//-- if 4 return passionately, if 5 return madly, if 6 return madly
//-- if petals is greater than 6 but equal to 7 return i love you, a little for 8 petals and so on...

public class Sid {

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(7));
    }

    public static String howMuchILoveYou(int nb_petals) {

        //your code here :)
        int result = nb_petals;
        while (result > 6) {
            result -= 6;
        }

        switch (result){
            case 1:return "I love you";
            case 2:return "a little";
            case 3:return "a lot";
            case 4:return "passionately";
            case 5:return "madly";
            case 6:return "not at all";
            default:return "";
        }

    }
}
