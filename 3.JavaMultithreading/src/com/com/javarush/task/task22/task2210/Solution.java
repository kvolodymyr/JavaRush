package com.javarush.task.task22.task2210;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] list = getTokens("Orange,Green,Yellow,Red",",");

        Arrays.asList(list).forEach(System.out::println);
    }

    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] list = new String[st.countTokens()];

        for (int i=0; st.hasMoreElements();i++) {
            list[i] = st.nextToken();
        }

        return list;
    }
}
