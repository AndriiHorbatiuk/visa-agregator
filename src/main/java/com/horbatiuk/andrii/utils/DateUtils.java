package com.horbatiuk.andrii.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Andrey on 25.08.2016.
 */
public class DateUtils {
    public static String convertMillisecondsToDate(Long milliSeconds){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(calendar.getTime());
    }
}
