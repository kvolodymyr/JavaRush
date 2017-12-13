package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static{
        threads.add(new Thread1("Infinity"));
        threads.add(new Thread2("InterruptedException"));
        threads.add(new Thread3("Ура"));
        threads.add(new Thread4("isWarning"));
        threads.add(new Thread5("SumN"));
    }
    public static void main(String[] args){
        for(Thread t:threads)t.start();
    }
    public static class Thread1 extends Thread{
        public Thread1(String name){
            super(name);
        }
        @Override
        public void run(){
            while(true);
        }
    }
    public static class Thread2 extends Thread{
        public Thread2(String name){
            super(name);
        }
        @Override
        public void run(){
            while(true)if(isInterrupted())System.out.println("InterruptedException");
        }
    }
    public static class Thread3 extends Thread{
        public Thread3(String name){
            super(name);
        }
        @Override
        public void run(){
            try{
                while(true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }catch(InterruptedException e){}
        }
    }
    public static class Thread4 extends Thread implements Message{
        public Thread4(String name){
            super(name);
        }
        @Override
        public void run(){
            while(!isInterrupted());
        }
        @Override
        public void showWarning(){
            interrupt();
        }
    }
    public static class Thread5 extends Thread{
        public Thread5(String name){
            super(name);
        }
        @Override
        public void run(){
            try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
                int i=0;
                for(String s=reader.readLine();!s.equals("N");s=reader.readLine())i+=Integer.parseInt(s);
                System.out.println(i);
            }catch(IOException e){}
        }
    }
}