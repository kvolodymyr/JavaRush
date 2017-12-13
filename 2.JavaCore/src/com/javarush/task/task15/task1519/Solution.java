package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            String s = reader.readLine();
            double x;
            try {
                x =  Double.parseDouble(s);
            } catch (Exception e) {
                if (s.equals("exit")) return;
                else print(s);
                continue;
            }
            if (s.contains(".")) print(x);
            else if ( x > 0 && x < 128) print((short) x);
            else print((int) x);
        } while (true);

        /*
        *
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
int i;
for(String s=reader.readLine();!s.equals("exit");s=reader.readLine()){
	if(s.matches("[-+]?\\d+\\.(\\d+)?"))print(Double.parseDouble(s));
	else if(s.matches("[-+]?\\d+")){
		i=Integer.parseInt(s);
		if(i<128&&i>0)print((short)i);
		else print(i);
	}
	else print(s);
}
        *
        * */
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
