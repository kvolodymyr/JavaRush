package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        String name = breader.readLine();
        String number1 = breader.readLine();
        String number2 = breader.readLine();

        System.out.format("%s получает %s через %s лет.", name, number1, number2);
    }
}
