package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        String name1 = breader.readLine();
        String name2 = breader.readLine();
        String name3 = breader.readLine();
        System.out.format("%s + %s + %s = Чистая любовь, да-да!", name1, name2, name3);
    }
}