package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args) throws RemoteException {
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj) throws  RemoteException {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch(IOException ex1) {
            System.out.println(ex1);
        } catch (NoSuchFieldException ex2) {
            System.out.println(ex2);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
