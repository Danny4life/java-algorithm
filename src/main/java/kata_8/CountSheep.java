package kata_8;

//If you can't sleep, just count sheep!!
//
//        Task:
//        Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
//        Input will always be valid, i.e. no negative integers.


public class CountSheep {

    public static void main(String[] args) {
        System.out.println(countingSheep(5));
    }

    public static String countingSheep(int num) {

        String text = "sheep...";
        String res = "";

        for(int i = 1; i <= num; i++){
            res += i + " " + text;
        }

        return res;
    }
}
