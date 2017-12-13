package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String tmp = null;
        String[] keys = new String[] {"user", "loser", "coder", "proger"};
        //тут цикл по чтению ключей, пункт 1
        while( !(tmp = reader.readLine().toLowerCase()).isEmpty())
        {
            //создаем объект, пункт 2
            final String key = tmp;
            if(!Arrays.asList(keys).contains(key)) {
                break;
            }
            person = getPerson(key);
            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if(person instanceof Person.User) {
            ((Person.User) person).live();
        } else if(person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if(person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        } else if(person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }

    public static Person getPerson(String key) {
        switch(key) {
            case "user":
                return new Person.User();
            case "loser":
                return new Person.Loser();
            case "coder":
                return new Person.Coder();
            case "proger":
                return new Person.Proger();
            default:
                return null;
        }
    }
}
