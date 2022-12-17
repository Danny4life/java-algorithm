package kata_8;

//Messi's Goal Total
//        Use variables to find the sum of the goals Messi scored in 3 competitions
//
//        Information
//        Messi goal scoring statistics:
//
//        Competition	Goals
//        La Liga	43
//        Champions League	10
//        Copa del Rey	5
//        Task
//        Create these three variables and store the appropriate values using the table above:
//        laLigaGoals
//        championsLeagueGoals
//        copaDelReyGoals
//        Create a fourth variable named totalGoals that stores the sum of all of Messi's goals for this year.


public class MessiGoals {
    public static void main(String[] args) {
        System.out.println(Goals.totalGoals());
    }

    class Goals {
        public static int laLigaGoals = 43;
        public static int championsLeagueGoals = 10;
        public static int copaDelReyGoals = 5;

        public static int totalGoals(){
            int sum = laLigaGoals + championsLeagueGoals + copaDelReyGoals;

            return sum;
        }

    }
}
