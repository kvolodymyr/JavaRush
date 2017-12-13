package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stream = new RushStream(new PrintStream(out));//создаем Декоратор
        System.setOut(stream);

        testString.printSomething();
        System.setOut(console); //Возвращаем как было

        System.out.println(out.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }

    public static class RushStream extends PrintStream {
        private static int count = 0;
        private String adv = System.lineSeparator() + "JavaRush - курсы Java онлайн";
        private PrintStream printStream;

        RushStream (PrintStream printStream) {
            super(printStream);
            this.printStream = printStream;
        }

        public RushStream(OutputStream out) {
            super(out);
        }


        @Override
        public void print(String s) {
            if (RushStream.count == 1) {
                printStream.print(s+adv);
                RushStream.count = 0;
            } else {
                printStream.print(s);
                RushStream.count++;
            }
        }
    }

}
