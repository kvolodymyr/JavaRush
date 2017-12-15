package com.javarush.task.task22.task2207;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        scanner.close();

        StringBuilder sb = new StringBuilder();
        scanner = new Scanner(new File(fileName));
        while(scanner.hasNext()) {
            sb.append(scanner.nextLine());
            sb.append(" ");
        }
        scanner.close();

        String[] words = sb.toString().split("[\\s\\t\\n\\x0B\\f\\r]");
        for(int i = 0; i < words.length; i++) {
            for(int j = i+1; j < words.length; j++) {
                // String s1 = words[i], s2 = new StringBuilder(words[j]).reverse().toString();
                // if (s1.equals(s2)) {
                if (words[i].equals(new StringBuilder(words[j]).reverse().toString())) {
                    boolean exists = false;
                    Pair pair = new Pair(words[i], words[j]);
                    for(Pair p: result) {
                        if(exists = pair.equals(p)) {
                            break;
                        }
                    }
                    if(!exists) {
                        result.add(pair);
                    }
                    break;
                }
            }
        }

        for(Pair pair : result) {
            System.out.println(pair.first + " " + pair.second);
        }

    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}
