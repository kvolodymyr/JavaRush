package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        list.addAll(list.subList(0, m));
        list.removeAll(list.subList(0, m));

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
