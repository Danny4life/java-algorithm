package kata_8;

//Your function takes two arguments:
//
//        current father's age (years)
//        current age of his son (years)
//        Сalculate how many years ago the father was twice as old as his son
//        (or in how many years he will be twice as old). The answer is always
//        greater or equal to 0, no matter if it was in the past or it is in the future.

//public class TwiceAsOldTest {
//    @Test
//    public void testSomething() {
//        assertEquals(30, TwiceAsOld.TwiceAsOld(30,0));
//        assertEquals(16, TwiceAsOld.TwiceAsOld(30,7));
//        assertEquals(15, TwiceAsOld.TwiceAsOld(45,30));
//
//    }
//}



public class TwiceAsOld {

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(45, 30));
    }

    public static int TwiceAsOld(int dadYears, int sonYears){
        //TODO: Add code here

        int newSonYears = sonYears * 2;
        return Math.abs(dadYears - newSonYears); // use Math.abs to convert negative value to positive value

    }
}
