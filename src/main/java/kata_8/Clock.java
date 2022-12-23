package kata_8;

//Clock shows h hours, m minutes and s seconds after midnight.
//
//        Your task is to write a function which returns the time since midnight in milliseconds.
//
//        Example:
//        h = 0
//        m = 1
//        s = 1
//
//        result = 61000
//        Input constraints:
//
//        0 <= h <= 23
//        0 <= m <= 59
//        0 <= s <= 59


public class Clock {

    public static void main(String[] args) {
        System.out.println(Past(0,1,1));//61000
    }

    public static int Past(int h, int m, int s)
    {
        //Happy Coding! ^_^
        int convertHoursToMilisecond = h * 60 * 60 * 1000;
        int convertMinutesToMilisecond = m * 60 * 1000;
        int convertSecondsToMilisecond = s * 1000;

        return (convertHoursToMilisecond + convertMinutesToMilisecond + convertSecondsToMilisecond);
    }
}
