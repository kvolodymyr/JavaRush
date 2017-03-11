package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        String name = breader.readLine();
        System.out.format("%s зарабатывает $5,000. Ха-ха-ха!", name);
    }
}
