package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
//        ArrayList[] list = new ArrayList[5];
//        list[0].add(new ArrayList(Arrays.asList(new String[] {"hello", "goodbuy"})));
//        list[1].add(new ArrayList(Arrays.asList(new String[] {"car", "track"})));
//        list[2].add(new ArrayList(Arrays.asList(new String[] {"baloon", "airplane"})));
//        list[3].add(new ArrayList(Arrays.asList(new String[] {"sun", "moon", "star"})));
//        list[4].add(new ArrayList(Arrays.asList(new String[] {"fox", "wolf", "panda"})));
//        return list;
        ArrayList < String > [] list = new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            list[i] = new ArrayList<>();
            list[i].add("list" + " " + i);
            list[i].add("list" + " " + i + "." + 1);
        }
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}