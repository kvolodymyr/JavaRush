package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        scanner.close();

        if (!args[0].equals("-u") && !args[0].equals("-d")) return;
        List<String> lines = new ArrayList<>();

        int id = Integer.parseInt(args[1]);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            while (reader.ready()) {
                lines.add(reader.readLine());
            }
        }

        Pattern p = Pattern.compile("([0-9]{1,8})");
        int indexAt = -1;
        for (int i = 0; i < lines.size(); i++) {
            String s = lines.get(i);
            Matcher m = p.matcher(s);
            if (m.lookingAt()) {
                try {
                    if (id == Integer.parseInt(s.substring(m.start(), m.end()))) {
                        indexAt = i;
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }

        if (args[0].equals("-u")) {
            String productName = args[2];
            float price = Float.parseFloat(args[3]);
            int qty = Integer.parseInt(args[4]);

            lines.set(indexAt, String.format(Locale.ROOT,"%-8d%-30s%-8.2f%-4d", id, productName, price, qty));
        } else {
            lines.remove(indexAt);
        }

        try (BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            for (String s: lines)
                buf.write(s+"\r\n");
        }
    }
}
