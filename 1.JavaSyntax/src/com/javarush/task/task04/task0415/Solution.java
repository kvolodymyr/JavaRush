package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        int a = Integer.parseInt(breader.readLine());
        int b = Integer.parseInt(breader.readLine());
        int c = Integer.parseInt(breader.readLine());

        if( (a + b) > c && (a + c) > b && (c + b) > a ) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}