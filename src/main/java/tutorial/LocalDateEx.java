package tutorial;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(2);
        LocalTime time = LocalTime.now();

        System.out.println("today date " + date);
        System.out.println("yesterday date " + yesterday);
        System.out.println("tomorrow data " + tomorrow);
        System.out.println("time is " + time);

    }
}
