package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber = bufferedReader.readLine();
        int number = 0;
        for(int i = 0; i < sNumber.length(); i++) {
            // number = Character.getNumericValue(sNumber.charAt(i));
            number = Integer.parseInt(sNumber.charAt(i) + "");
            if( number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

//        for(int x = Integer.parseInt(bufferedReader.readLine()); x >= 0 ; x = x / 10){
//            if ((x % 2) == 0) even++; else odd++;
//            if (x == 0) break;
//        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
