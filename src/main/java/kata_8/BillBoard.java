package kata_8;

public class BillBoard {


//    You can print your name on a billboard ad. Find out how much it will cost you.
//    Each character has a default price of £30, but that can be different if you are given 2
//    parameters instead of 1 (allways 2 for Java).
//
//    You can not use multiplier "*" operator.
//
//    If your name would be Jeong-Ho Aristotelis, ad would cost £600. 20 leters * 30 = 600 (Space counts as a character).


//    class SolutionTest {
//        private void doTest(int expected, String name) {
//            doTest(expected, name, 30);
//        }
//
//        private void doTest(int expected, String name, int price) {
//            assertEquals(expected, Billboard.billboard(name, price));
//        }
//
//        @Test
//        void testBasic() {
//            doTest(600, "Jeong-Ho Aristotelis");
//            doTest(570, "Abishai Charalampos");
//            doTest(420, "Idwal Augustin");
//            doTest(260, "Hadufuns John", 20);
//            doTest(570, "Zoroaster Donnchadh");
//            doTest(450, "Claude Miljenko");
//            doTest(165, "Werner Vígi", 15);
//            doTest(420, "Anani Fridumar");
//            doTest(270, "Paolo Oli");
//            doTest(600, "Hjalmar Liupold", 40);
//            doTest(390, "Simon Eadwulf");
//        }
//    }


    // steps

    // 1. creating a variable that stores the cost
    // 2. loop through all the characters of name
    // 3.add the price to the total cost each time



    public static void main(String[] args) {
        System.out.println(billboard("Hadufuns John", 20));
    }


    public static int billboard(String name, int price) {
        // Your code


        int totalCost = 0;

        for(int i = 0; i < name.length(); i++){
            totalCost += price;
        }
            return totalCost;
    }
}
