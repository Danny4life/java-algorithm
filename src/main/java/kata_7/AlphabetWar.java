package kata_7;

//Introduction
//        There is a war and nobody knows - the alphabet war!
//        There are two groups of hostile letters.
//        The tension between left side letters and right side letters was too high and the war began.
//
//        Task
//        Write a function that accepts fight string consists of only small letters and return who wins the fight.
//        When the left side wins return Left side wins!, when the right side wins return Right side wins!,
//        in other case return Let's fight again!.
//
//        The left side letters and their power:
//
//        w - 4
//        p - 3
//        b - 2
//        s - 1
//        The right side letters and their power:
//
//        m - 4
//        q - 3
//        d - 2
//        z - 1
//        The other letters don't have power and are only victims.
//
//        Example
//        AlphabetWar("z");        //=> Right side wins!
//        AlphabetWar("zdqmwpbs"); //=> Let's fight again!
//        AlphabetWar("zzzzs");    //=> Right side wins!
//        AlphabetWar("wwwwwwz");  //=> Left side wins!


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class AlphabetWarTest {
//    @Test
//    public void BasicTest() {
//        assertEquals("Right side wins!", Kata.alphabetWar("z"));
//        assertEquals("Let's fight again!", Kata.alphabetWar("zdqmwpbs"));
//        assertEquals("Right side wins!", Kata.alphabetWar("zzzzs"));
//        assertEquals("Left side wins!", Kata.alphabetWar("wwwwwwz"));
//    }
//}

//Pseudocode
// 1. declare veriable for both left and right side
// 2.check if left side has more letters than right side, vice versa
// 3. if left side has more characters return left side wins, else if not return right side win
// 4. else return lets fight again

public class AlphabetWar {

    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
    }

    public static String alphabetWar(String fight){

        int leftScore = 0;
        int rightScore = 0;

        for (char c : fight.toCharArray()) {
            switch (c) {
                case 'w':
                    leftScore += 4;
                    break;
                case 'p':
                    leftScore += 3;
                    break;
                case 'b':
                    leftScore += 2;
                    break;
                case 's':
                    leftScore += 1;
                    break;
                case 'm':
                    rightScore += 4;
                    break;
                case 'q':
                    rightScore += 3;
                    break;
                case 'd':
                    rightScore += 2;
                    break;
                case 'z':
                    rightScore += 1;
                    break;
            }
        }

        if (leftScore > rightScore) {
            return "Left side wins!";
        } else if (rightScore > leftScore) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }
}
