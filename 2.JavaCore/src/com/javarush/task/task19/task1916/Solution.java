package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static ArrayList<String> older = new ArrayList<String>(50);
    public static ArrayList<String> newest = new ArrayList<String>(50);

    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));

        while (reader1.ready()) {
            older.add(reader1.readLine());
        }
        reader1.close();
        while (reader2.ready()) {
            newest.add(reader2.readLine());
        }
        reader2.close();

        int i = 0, j = 0;
        while(i < older.size() || j < newest.size()) {
            if(i < older.size() && j < newest.size() && older.get(i).equals(newest.get(j))) {
                Solution.lines.add(new LineItem(Type.SAME, older.get(i)));
                i++; j++;
            } else {
                if (i >= older.size() || j + 1 < newest.size() && older.get(i).equals(newest.get(j + 1))) {
                    Solution.lines.add(new LineItem(Type.ADDED, newest.get(j)));
                    j++;
                } else if (j >= newest.size() || i + 1 < older.size() && newest.get(j).equals(older.get(i+1))) {
                    Solution.lines.add(new LineItem(Type.REMOVED, older.get(i)));
                    i++;
                }
            }
        };

        for (LineItem li : Solution.lines)
            System.out.println(li.type + " " + li.line);
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
