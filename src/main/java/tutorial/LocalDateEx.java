package tutorial;

import java.time.LocalDate;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(2);

        System.out.println("today date " + date);
        System.out.println("yesterday date " + yesterday);
        System.out.println("tomorrow data " + tomorrow);

    }
}
