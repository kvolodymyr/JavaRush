package com.javarush.task.task08.task0814;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
//        // java.util.ConcurrentModificationException
//        for(Integer i : set) {
//            if( i > 10) set.remove(i);
//        }
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
        {
            Integer i = iterator.next();
            if( i > 10) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        removeAllNumbersMoreThan10(createSet());
    }
}
