package kata_7;

//Write a function consonantCount, consonant_count or ConsonantCount that takes a
//        string of English-language text and returns the number of consonants in the string.
//
//        Consonants are all letters used to write English excluding the vowels a, e, i, o, u.

//public class ConsonantsTest {
//
//    @Test
//    public void testCase1() {
//        assertEquals("Test string is empty string",0,Consonants.getCount(""));
//        assertEquals("Test string: \"aaaaa\"",0,Consonants.getCount("aaaaa"));
//        assertEquals("Test string: \"XaeiouX\"",2,Consonants.getCount("XaeiouX"));
//        assertEquals("Test string: \"Bbbbb\"",5,Consonants.getCount("Bbbbb"));
//        assertEquals("Test string: \"helLo world\"",7,Consonants.getCount("helLo world"));
//        assertEquals("Test string: \"h^$&^#$&^elLo world\"",7,Consonants.getCount("h^$&^#$&^elLo world"));
//        assertEquals("Test string: \"012345_Cb\"",2,Consonants.getCount("012345_Cb"));
//        assertEquals("Test string: \"0123456789\"",0,Consonants.getCount("0123456789"));
//    }
//
//}

//STEPS
// loop through the strings
// check if words have consonant, if yes return the number of consonants found in the string
// if not return zero

public class Cosonant {

    public static void main(String[] args) {
        System.out.println(getCount("h^$&^#$&^elLo world"));
    }

    public static int getCount(String str) {
        // ...
        return str.replaceAll("[^A-Za-z]|[AEIOUaeiou]", "").length();
    }
}
