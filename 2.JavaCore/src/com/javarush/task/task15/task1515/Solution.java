package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;
    static{
        int [] arr = new int[2];
        for(int i=0; i<arr.length; i++){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try{
                arr[i] = Integer.parseInt(br.readLine());
                br.close();
            }
            catch (IOException e){}
        }
        A = arr[0];
        B = arr[1];
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);

    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
