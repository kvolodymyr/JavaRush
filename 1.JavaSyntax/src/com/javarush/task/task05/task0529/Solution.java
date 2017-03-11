package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        int total = 0;
        while(true) {
            String val = breader.readLine();
            if(val.equals("сумма")) break;
            total += Integer.parseInt(val);
        }
        System.out.println(total);
    }
}
