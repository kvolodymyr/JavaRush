package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()) {
            String line = reader.readLine();
            String name = line.replaceAll("[\\w]", "").trim();
            String[] data = line.substring(name.length()).trim().split(" ");
            Calendar date = new GregorianCalendar(
                Integer.parseInt(data[2]),
                Integer.parseInt(data[1])-1,
                Integer.parseInt(data[0]));
            PEOPLE.add(new Person(name, date.getTime()));
        }
        reader.close();
    }
}
