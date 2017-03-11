package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int maxSequenceSize = 0, sequenceSize = 1;
        int number = list.get(0);
        for(int i = 1; i < 10; i++)
        {
            if(number == list.get(i)) {
                sequenceSize++;
            } else {
                number = list.get(i);
                if(sequenceSize > maxSequenceSize)
                {
                    maxSequenceSize = sequenceSize;
                }
                sequenceSize = 1;
            }
        }
        if(sequenceSize > maxSequenceSize)
        {
            maxSequenceSize = sequenceSize;
        }

        System.out.println(maxSequenceSize);
    }
}