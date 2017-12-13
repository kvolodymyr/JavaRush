package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            lines = Files.readAllLines(Paths.get(Statics.FILE_NAME), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Scanner s = new Scanner(new File(Statics.FILE_NAME));
        while (s.hasNext()){
            lines.add(s.next());
        }
        s.close();*/
    }

    public static void main(String[] args)  {
        System.out.println(lines);
    }
}
