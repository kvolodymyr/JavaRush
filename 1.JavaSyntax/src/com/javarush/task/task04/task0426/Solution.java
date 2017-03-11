package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        if( a== 0 ) {
            System.out.println("ноль");
        } else {
            System.out.print(a > 0 ? "положительное " : "отрицательное ");
            System.out.println(a % 2 == 0 ? "четное число" : "нечетное число");
        }
    }
}
