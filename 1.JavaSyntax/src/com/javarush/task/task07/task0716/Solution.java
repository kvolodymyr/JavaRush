package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("bob"); //0
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> out = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
//            if (list.get(i).indexOf("р") == -1 && list.get(i).indexOf("л") == -1 ||
//                list.get(i).indexOf("р") != -1 && list.get(i).indexOf("л") != -1) {
//                out.add(list.get(i));
            if (list.get(i).indexOf("р") != -1 && list.get(i).indexOf("л") == -1) {
            } else if (list.get(i).indexOf("р") == -1 && list.get(i).indexOf("л") != -1) {
                Collections.addAll(out, list.get(i), list.get(i));
            }   else {
                out.add(list.get(i));
            }
        }
        return out;
    }
}