package kata_8;

//For every good kata idea there seem to be quite a few bad ones!
//
//        In this kata you need to check the provided array (x) for good ideas 'good'
//        and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!',
//        if there are more than 2 return 'I smell a series!'. If there are no good ideas,
//        as is often the case, return 'Fail!'.

//public class SolutionTest {
//    @Test
//    public void basicTests() {
//        assertEquals("Fail!", Kata.well(new String[] {"bad", "bad", "bad"}));
//        assertEquals("Publish!", Kata.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
//        assertEquals("I smell a series!", Kata.well(new String[] {
//                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
//    }
//}

//STEPS
// check the number of good present
// if it is one or two return publish
// if it is more than two return i smell a series
// if there is no good idea return fail
public class KataWells {

    public static void main(String[] args) {
        System.out.println(well(new String[]{"good", "good", "good", "bad", "bad", "bad"}));
    }

    public static String well(String[] x) {
        // TODO

        int counter = 0;

        for(String s : x){
            if(s == "good"){
                counter += 1;
            }
        }

        return counter == 0 ? "Fail!" : counter > 2 ? "I smell a series!" : "Publish!";

    }

}
