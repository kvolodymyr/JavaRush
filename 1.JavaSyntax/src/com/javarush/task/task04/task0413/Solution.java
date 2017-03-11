package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        int dayOfWeek = Integer.parseInt(breader.readLine());
        if(dayOfWeek >= 1 && dayOfWeek <= 7) {
            System.out.println(days[dayOfWeek - 1]);
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}