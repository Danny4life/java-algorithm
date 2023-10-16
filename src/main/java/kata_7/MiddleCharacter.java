package kata_7;

//You are going to be given a word. Your job is to return the middle character of the word.
//        If the word's length is odd, return the middle character. If the word's length is even,
//        return the middle 2 characters.
//
//        #Examples:
//
//        Kata.getMiddle("test") should return "es"
//
//        Kata.getMiddle("testing") should return "t"
//
//        Kata.getMiddle("middle") should return "dd"
//
//        Kata.getMiddle("A") should return "A"
//        #Input
//
//        A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than
//        1000 in some test cases due to an error in the test cases). You do not need to test for this.
//        This is only here to tell you that you do not need to worry about your solution timing out.
//
//        #Output
//
//        The middle character(s) of the word represented as a string.


//public class MiddleExampleTests {
//    @Test
//    public void evenTests() {
//        assertEquals("es", Kata.getMiddle("test"));
//        assertEquals("dd", Kata.getMiddle("middle"));
//    }
//
//    @Test
//    public void oddTests() {
//        assertEquals("t", Kata.getMiddle("testing"));
//        assertEquals("A", Kata.getMiddle("A"));
//    }
//}

//Steps
// 1. get the lenght of the word
// 2. loop through the word lenght
// 2. then check if word lenght is odd, if yes divide it by 2 to get the middle letter
// 3. if its even then return the two middle letter
public class MiddleCharacter {

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
    }

    public static String getMiddle(String word) {
        //Code goes here!

        int wordLength = word.length();

        String result = "";


        for(int i = 0; i < wordLength; i++){
            if(wordLength % 2 == 1){
                int middleIndex = wordLength / 2;

                return word.substring(middleIndex, middleIndex + 1);
            }else {
                int middleIndex = wordLength / 2 - 1;
                result = word.substring(middleIndex, middleIndex + 2);

            }

        }
        return result;
    }


}
