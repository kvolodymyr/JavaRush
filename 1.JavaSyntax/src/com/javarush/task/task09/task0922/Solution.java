package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat formatIn = new SimpleDateFormat("M/dd/yyyy");
        Date date = formatIn.parse(reader.readLine());
        SimpleDateFormat formatOut = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        System.out.println(formatOut.format(date).toUpperCase());

//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM", myDateFormatSymbols );
//        System.out.println("Constructor 3: " + dateFormat.format( currentDate ) );

    }

//    private static DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols(){
//        @Override
//        public String[] getMonths() {
//            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
//                    "июля", "августа", "сентября", "октября", "ноября", "декабря"};
//        }
//    };
}
