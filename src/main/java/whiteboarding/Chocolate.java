package whiteboarding;

public class Chocolate {

    public static void main(String[] args) {
        System.out.println(breakChocolate(5,5));
    }


        public static int breakChocolate(int n, int m) {

            if (n <= 0 || m <= 0) {
                return 0; // No breaks needed for invalid input
            }

            // The minimum number of breaks needed is the total number of squares - 1
            // where total number of squares = n * m
            return n * m - 1;
        }

}
