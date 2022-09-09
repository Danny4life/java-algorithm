package kata_8;

//After a hard quarter in the office you decide to get some rest on a vacation.
// So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
//
//        You will need a rental car in order for you to get around in your vacation.
//        The manager of the car rental makes you some good offers.
//
//        Every day you rent the car costs $40. If you rent the car for 7 or more days,
//        you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
//
//        Write a code that gives out the total amount for different days(d).

// 1 * 40 = 40$
// 7 * 40 = 280$ - 50$ = 230$
// 3 * 40 = 120$ - 20$ = 100$
// 4 * 40 = 160$ - 20$ = 140$


import java.util.Random;

public class Transportation {

    public static void main(String[] args) {
        System.out.println(rentalCarCost(7));
    }

    public static int rentalCarCost(int d) {
        // Your solution here
       int cost = 40;

       if(d < 3){
           return d * cost;
       } else if (d >= 7){
           return d * cost - 50;
       } else {
           return d * cost - 20;
       }

    }
}
