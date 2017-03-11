package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int total = 0;
        String n = String.valueOf(number);
        for(int i = 0; i < n.length(); i++) {
            total += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return total;
    }
}