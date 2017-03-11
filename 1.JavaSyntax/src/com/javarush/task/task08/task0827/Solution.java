package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dt = new Date(date);
        long days = (dt.getTime() - new Date(dt.getYear(), 0, 1).getTime()) / (24 * 60 * 60 * 1000);
        // System.out.println(days);
        return days % 2 == 0;
    }
}
