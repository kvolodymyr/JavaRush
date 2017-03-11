package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        // #1 - ArrayList<String> list = new ArrayList<String>(Arrays.asList( "test1", "test2", "test3", "test4", "test5"));
        // #2 -
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "test1", "test2", "test3", "test4", "test5");

        System.out.println(list.size());
        for(int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
