package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];
        a[0] = Integer.parseInt(reader.readLine());
        a[1] = Integer.parseInt(reader.readLine());
        a[2] = Integer.parseInt(reader.readLine());

        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j ++) {
                if(a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        for(int i = 0; i < 3; i ++) System.out.print(a[i] + " ");
    }
}
