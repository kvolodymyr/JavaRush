package com.javarush.task.task16.task1630;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        Scanner scanner = new Scanner(System.in);
        firstFileName = scanner.next();
        secondFileName = scanner.next();
        scanner.close();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

        public void run() {
            String s = "";
            // int count = 0;
            try {
                Scanner scanner = new Scanner(new File(fullFileName));
                while (scanner.hasNext()){
                    s = s + scanner.next() + " ";
                    // count++;
                }
                scanner.close();
            } catch(IOException ex) {
                System.out.println("?");
                s = "";
            }
            fileContent = s; //+ "\n" + String.valueOf(count);
        }
    }
}
