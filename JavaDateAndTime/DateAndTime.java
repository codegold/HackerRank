package JavaDateAndTime;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;


public class DateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        if (Integer.parseInt(year) >= 2000 && Integer.parseInt(year) <= 3000) {

            Calendar calendar = Calendar.getInstance();

            calendar.set(Integer.parseInt(month), Integer.parseInt(day),
                    Integer.parseInt(year)); //passing the values

            String dayName = new DateFormatSymbols().
                    getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)];

            // it will get the name of day
            System.out.println(dayName.toUpperCase());
        }

    }
}