package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);

        String sYears = buffer.readLine();
        int years = Integer.parseInt((sYears));
        String name = buffer.readLine();

        System.out.format("%s захватит мир через %d лет. Му-ха-ха!", name, years);
    }
}
