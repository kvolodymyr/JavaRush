package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.IntStream;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0) return  String.valueOf(BigInteger.ZERO);
        if (n == 0) return  String.valueOf(BigInteger.ONE);
        return String.valueOf(BigInteger.valueOf(n).multiply(new BigInteger(factorial(n-1))));
        /*
        //add your code here
        String s = null;
        if (n <= 150 && n >= 0) {
            s = String.valueOf(IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y));
        } else {
            s = String.valueOf(0);
        }
        return s; */
        /* if(n == 1) return "1";
        if(n < 0) return "0";
        return "" + n * Integer.parseInt(factorial(n - 1)); */
        /*
public static String factorial(int n) {
    String s = null;
    if (n <= 150 && n >= 0) {
        s = String.valueOf(IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y));
    } else {
        s = String.valueOf(0);
    }
    return s;
}

         return String.valueOf(n < 0 ? 0 : IntStream.rangeClosed(1, n)       // получаем поток значений int от 1 до n включительно
                                            .mapToObj(BigInteger::valueOf)  // приводим значения int в потоке к типу BigInteger
                                            .reduce(BigInteger.ONE, BigInteger::multiply)); // сводим поток к одному значению BigInteger путем перемножения (multiply)

        */
    }
}
