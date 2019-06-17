package JavaDateAndTime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class DateAndTimeAnother {

    public static String getDay(int month, int day, int year) {
        return LocalDate.of(month, day, year).getDayOfWeek().name();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();
        scan.close();


        System.out.println(getDay(month, day, year));

    }
}
