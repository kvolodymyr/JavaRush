package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static String firstFileName;
    public static String secondFileName;

    static {
        /*
        try {
            Scanner scanner = new Scanner(System.in);
            firstFileName = scanner.next();
            secondFileName = scanner.next();
            scanner.close();

            scanner = new Scanner(new File(firstFileName));
            while (scanner.hasNext()) {
                allLines.add(scanner.next());
            }
            scanner.close();

            scanner = new Scanner(new File(secondFileName));
            while (scanner.hasNext()) {
                forRemoveLines.add(scanner.next());
            }
            scanner.close();
        }catch(FileNotFoundException ex) {

        }

        */

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println("FilePath error");
        }

        try {
            BufferedReader fr1 = new BufferedReader(new FileReader(new File(firstFileName)));
            BufferedReader fr2 = new BufferedReader(new FileReader(new File(secondFileName)));
            while (fr1.ready()) {
                allLines.add(fr1.readLine());
            }
            while (fr2.ready()) {
                forRemoveLines.add(fr2.readLine());
            }
            fr1.close();
            fr2.close();
        } catch (IOException e) {
            System.out.println("FileReader error!");
        }
    }

    public static void main(String[] args) throws CorruptedDataException {
        new Solution().joinData();
    }

    public synchronized void joinData () throws CorruptedDataException {
        for (int i = 0; i < forRemoveLines.size(); i++) {
            if (allLines.contains(forRemoveLines.get(i))) {
                allLines.remove(forRemoveLines.get(i));
            } else {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }
}
