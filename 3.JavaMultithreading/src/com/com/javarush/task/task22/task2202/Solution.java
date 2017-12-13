package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String parts[];
        if (string == null || string.isEmpty() || (parts = string.split(" ")).length < 5) {
            throw new TooShortStringException();
        }
        return parts[1] + " " + parts[2] + " " + parts[3] + " " + parts[4];
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
