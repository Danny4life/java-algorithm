package kata_7;

//
//In this kata, your task is to implement an extended version of the famous rock-paper-scissors game.
//        The rules are as follows:
//
//        Scissors cuts Paper
//        Paper covers Rock
//        Rock crushes Lizard
//        Lizard poisons Spock
//        Spock smashes Scissors
//        Scissors decapitates Lizard
//        Lizard eats Paper
//        Paper disproves Spock
//        Spock vaporizes Rock
//        Rock crushes Scissors
//        Task:
//        Given two values from the above game, return the Player result as "Player 1 Won!", "Player 2 Won!", or "Draw!".
//
//        Inputs
//        Values will be given as one of "rock", "paper", "scissors", "lizard", "spock".

//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//class SolutionTest {
//
//    @Test void player1Wins() {
//        assertEquals("Player 1 Won!", Kata.rpsls("rock", "lizard"));
//        assertEquals("Player 1 Won!", Kata.rpsls("paper", "rock"));
//        assertEquals("Player 1 Won!", Kata.rpsls("scissors", "lizard"));
//        assertEquals("Player 1 Won!", Kata.rpsls("lizard", "paper"));
//        assertEquals("Player 1 Won!", Kata.rpsls("spock", "rock"));
//    }
//
//    @Test void player2Wins() {
//        assertEquals("Player 2 Won!", Kata.rpsls("lizard","scissors"));
//        assertEquals("Player 2 Won!", Kata.rpsls("spock","lizard"));
//        assertEquals("Player 2 Won!", Kata.rpsls("paper","lizard"));
//        assertEquals("Player 2 Won!", Kata.rpsls("scissors","spock"));
//        assertEquals("Player 2 Won!", Kata.rpsls("rock","spock"));
//    }
//
//    @Test void draws() {
//        assertEquals("Draw!", Kata.rpsls("rock", "rock"));
//        assertEquals("Draw!", Kata.rpsls("spock", "spock"));
//    }
//}

//STEPS
//check if player 1 is > player 2, if yes return player 1 won
// else if player 2 is > than player 1 return player 2 won
// if both player 1 and player 2 are equal return draw


import java.util.HashMap;
import java.util.Map;

public class Rps {

    public static void main(String[] args) {
        System.out.println(rpsls("lizard", "spock"));
    }

    public static String rpsls(String player1, String player2) {
        // Your code here!


        Map<String, String> m = new HashMap<>();
        m.put("scissors", "paperlizard");
        m.put("paper", "rockspock");
        m.put("rock", "lizardscissors");
        m.put("spock", "scissorsrock");
        m.put("lizard", "paperspock");
        if (m.get(player1).contains(player2)) return "Player 1 Won!";
        if (m.get(player2).contains(player1)) return "Player 2 Won!";
        return "Draw!";

    }

}
