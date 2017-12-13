package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length < 4 || !args[0].equals("-c")) return;

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        scanner.close();

        String productName = args[1];
        float price = Float.parseFloat(args[2]);
        int qty = Integer.parseInt(args[3]);

        //List<String> lines = Files.readAllLines(Paths.get(fileName)); //так проще, но не пропускается
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            while (reader.ready()) {
                lines.add(reader.readLine());
            }
        }

        Pattern p = Pattern.compile("([0-9]{1,8})");
        int maxId = 0;
        for (String s : lines) {
            Matcher m = p.matcher(s);
            if (m.lookingAt()) {
                try {
                    //System.out.println(s.substring(m.start(), m.end()));
                    int id = Integer.parseInt(s.substring(m.start(), m.end()));
                    if (id > maxId)
                        maxId = id;
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }

        if (maxId++ >= 99999999) return;

        lines.add(String.format(Locale.ROOT,"%-8d%-30s%-8.2f%-4d", maxId, productName, price, qty));

        try (BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            for (String s: lines)
                buf.write(s+"\r\n");
        }
    }
}
