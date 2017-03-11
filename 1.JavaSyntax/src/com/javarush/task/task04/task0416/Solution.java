package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();

        double a = Double.parseDouble(sn);
        int b = (int) ((a+5)%5);
        String z="зелёный"; String g="желтый"; String k="красный";
        String s = null;
        if(b>=0 & b<3)s=z;
        if(b>=3 & b<4)s=g;
        if(b>=4 & b<5)s=k;
        System.out.println(s);
    }
}