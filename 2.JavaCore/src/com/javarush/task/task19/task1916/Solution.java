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
    public static ArrayList<String> lines1 = new ArrayList<String>(50);
    public static ArrayList<String> lines2 = new ArrayList<String>(50);

    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));

        while (reader1.ready()) {
            lines1.add(reader1.readLine());
        }
        reader1.close();
        while (reader2.ready()) {
            lines2.add(reader2.readLine());
        }
        reader2.close();


        String line, s1, s2, s3;
        for (int i = 0; i < lines1.size(); i++) {
            line = lines1.get(i);
            s1 = s2 = s3 = null;
            if (i > 0) {
                s1 = lines2.get(i - 1);
            }
            if (i < lines2.size()) {
                s2 = lines2.get(i);
            }
            if (i + 1 < lines2.size()) {
                s3 = lines2.get(i + 1);
            }

            if (!line.equals(s1) && !line.equals(s2) && !line.equals(s3)) {
                Solution.lines.add(new LineItem(Type.REMOVED, line));
                lines2.add(i, line);
            }

            if (!line.equals(s1) && !line.equals(s2) && line.equals(s3)) {
                Solution.lines.add(new LineItem(Type.ADDED, s2));
                lines1.add(i, s2);
            }

            if (!line.equals(s1) && line.equals(s2) && !line.equals(s3)) {
                Solution.lines.add(new LineItem(Type.SAME, line));
            }
        }

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
