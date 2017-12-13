package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException, DownloadException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = null;
        while(true) {
            try {
                String file = scanner.next();
                inputStream = new FileInputStream(file);
                if (inputStream.available() < 1000) {
                    throw new DownloadException();
                }
            } catch (Exception e) {
                throw e;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
