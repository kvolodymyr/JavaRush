package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution{
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() throws NullPointerException {
        //add your code here - добавьте код тут
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next().toLowerCase();
        if(type.equals("helicopter")) {
            result  = new Helicopter();
        } else if (type.equals("plane")) {
            int passengers = scanner.nextInt();
            result  = new Plane(passengers);
        } else {
            throw new NullPointerException("Unknown type");
        }
        scanner.close();
    }
}
