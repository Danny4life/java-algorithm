package kata_8;
//Messi is a soccer player with goals in three leagues:
//
//        LaLiga
//        Copa del Rey
//        Champions
//        Complete the function to return his total number of goals in all three leagues.
//
//        Note: the input will always be valid.
//
//        For example:
//
//        5, 10, 2  -->  17

public class MessiGoalFunction {

    public static void main(String[] args) {
        System.out.println(goals(43,10,5));
    }

    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here

        int res = laLigaGoals + copaDelReyGoals + championsLeagueGoals;

        return res;
    }
}
