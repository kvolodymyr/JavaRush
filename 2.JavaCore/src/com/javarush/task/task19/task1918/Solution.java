package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));
        StringBuffer text = new StringBuffer();
        while (reader.ready()) {
            text.append(reader.readLine());
        }
        reader.close();
        text = new StringBuffer(text.toString().replaceAll("\r\n", ""));

        String tagOpen = "<" + args[0];
        String tagClose = "</" + args[0] + ">";

        int posOpen = -1;
        int posClose = -1;
        int shift = -1;
        Stack<Integer> openedTags = new Stack<>();
        Map<Integer, Integer> tags = new TreeMap<>(new IntegerComparator());
        while (true) {
            posOpen = text.indexOf(tagOpen, shift);
            posClose = text.indexOf(tagClose, shift);
            if (posOpen < 0 && posClose < 0) {
                break;
            }
            if (posOpen != -1 && posOpen < posClose) {
                openedTags.push(posOpen);
                shift = posOpen + tagOpen.length();
                continue;
            }

            if (posClose != -1 && (posOpen > posClose || posOpen == -1)) {
                if (openedTags.isEmpty()) {
                    break;
                }
                tags.put(openedTags.pop(), posClose + tagClose.length());
                shift = posClose + tagClose.length();
            }
        }

        for (Map.Entry<Integer, Integer> pair : tags.entrySet()) {
            System.out.println(text.substring(pair.getKey(), pair.getValue()));
        }
    }

    static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }

}
