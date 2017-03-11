package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        String name = breader.readLine();

        for(int i = 0; i < 10; i++)
            System.out.println(name + " любит меня.");
    }
}
