package org.neosuniversity.time;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class NeosDateUtil {

    public static String getCurrentDatePlusDays(Integer days,String pattern){

        DateTime today = new DateTime();
        DateTime newDate = today.plusDays(days);

        return newDate.toString(pattern);
    }


    public static Date getDateByString(String pattern, String date){

        DateTimeFormatter formatter = DateTimeFormat.forPattern(pattern);
        DateTime dt = formatter.parseDateTime(date);
        return dt.toDate();

    }
    public static int getDaysBetweenDates(String pattern, String date1,String date2){

        DateTimeFormatter formatter = DateTimeFormat.forPattern(pattern);
        DateTime dt1 = formatter.parseDateTime(date1);
        DateTime dt2 = formatter.parseDateTime(date2);
        return  Days.daysBetween(dt1, dt2).getDays();

    }
}
