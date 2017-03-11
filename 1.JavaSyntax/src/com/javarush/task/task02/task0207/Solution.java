package com.javarush.task.task02.task0207;

/* 
Кусочек калькулятора
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 5;
        int b = 7;
        System.out.println(sum(a, b));
        System.out.println(multiply(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
}
