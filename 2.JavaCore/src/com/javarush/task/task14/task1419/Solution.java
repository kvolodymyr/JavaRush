package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            Integer n = null;
            float i = n * 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[-10];
            i[0] = 1;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[] {0, 1, 2};
            int n = i[5];

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            new InputStreamReader(new FileInputStream(""));

        } catch (Exception e) {
            exceptions.add(e);
        }


        try {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(Integer.MAX_VALUE, "test");
            map.get(-1);
        } catch (Exception e) {
            exceptions.add(e);
        }


        // exceptions.add( new NotBoundException());
        exceptions.add( new NoSuchFieldException());
        // exceptions.add( new NotOwnerException());
        exceptions.add( new NoSuchMethodException());
        exceptions.add( new NumberFormatException());
        exceptions.add( new NoSuchAlgorithmException());
        // exceptions.add( new NoSuchElementException());
        exceptions.add( new NegativeArraySizeException());
    }
}
