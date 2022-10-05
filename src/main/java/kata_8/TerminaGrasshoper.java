package kata_8;

//Terminal game move function
//        In this game, the hero moves from left to right.
//        The player rolls the dice and moves the number of spaces indicated by the dice two times.
//
//        Create a function for the terminal game that takes the current position of the hero and the roll (1-6)
//        and return the new position.
//
//        Example:
//        move(3, 6) should equal 15

// add roll + roll
// add final roll + position

public class TerminaGrasshoper {

    public static void main(String[] args) {
        System.out.println(move(2,5));
    }

    public static int move(int position, int roll) {
        // your code here

        return (roll + roll) + position;


    }
}
