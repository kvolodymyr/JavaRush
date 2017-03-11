package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        // System.out.println("MAY 1 2012");
        DateFormatSymbols symbols = new DateFormatSymbols(Locale.US);
        symbols.setShortMonths(new String[]{ "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" });
        SimpleDateFormat formatter = new SimpleDateFormat("MMM d yyyy", symbols);
        // Date date = new Date(17, 0, 1);
        GregorianCalendar gcalendar = new GregorianCalendar(2017, 0, 1);
        System.out.println(formatter.format(gcalendar.getTime())); // MAY 1 2012
    }
}
