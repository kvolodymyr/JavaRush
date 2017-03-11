package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> plants = new HashSet<String>();
        plants.addAll(Arrays.asList(new String[] { "арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель" }));

        for(String item : plants) {
            System.out.println(item);
        }

//        Iterator iterator = plants.iterator();
//        while(iterator.hasNext()) {
//            String text = (String)iterator.next();
//            System.out.println(text);
//        }
    }
}
