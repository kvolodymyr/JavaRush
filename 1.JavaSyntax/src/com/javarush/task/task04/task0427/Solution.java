package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        if( a < 1 || a > 999) return;

        String[] dscr = { "однозначное", "двузначное", "трехзначное" };

        System.out.print(a % 2 == 0 ? "четное " : "нечетное ");
        System.out.print(dscr[String.valueOf(a).length()-1]);
        System.out.println(" число");
    }
}
