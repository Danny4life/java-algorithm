package kata_8;

//A hero is on his way to the castle to complete his mission. However,
//        he's been told that the castle is surrounded with a couple of powerful
//        dragons! each dragon takes 2 bullets to be defeated, our hero has no idea
//        how many bullets he should carry.. Assuming he's gonna grab a specific given
//        number of bullets and move forward to fight another specific given number of dragons, will he survive?
//
//        Return true if yes, false otherwise :)


//class SolutionTest {
//    @Test @DisplayName("A true hero")
//    void aTrueHero() {
//        assertTrue(Solution.hero(10, 5), "With 10 bullets and 5 dragons");
//        assertTrue(Solution.hero(100, 40), "With 100 bullets and 40 dragons");
//    }
//
//    @Test @DisplayName("A false hero")
//    void aFalseHero() {
//        assertFalse(Solution.hero(4, 5), "With 4 bullets and 5 dragons");
//        assertFalse(Solution.hero(1500, 751), "With 1500 bullets and 751 dragons");
//        assertFalse(Solution.hero(0, 1), "With 0 bullets and 1 dragon");
//        assertFalse(Solution.hero(7, 4), "With 7 bullets and 4 dragons");
//    }
//}


// Steps
// * hero needs 2 bullets to kill a dragon
// 1. multiply dragon by 2, if dragon is greater or less than bullet
// 2. return true
// 3. return false

public class Hero {

    public static void main(String[] args) {

        System.out.println(hero(104799833 , 23148368));

    }


    public static boolean hero(int bullets, int dragons) {
        // please code here

      //System.out.println(104799833 % 23148368);

        if (bullets >= (long)dragons *2){
            return true;
        } else {
            return false;
        }


    }
}
