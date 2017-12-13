package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String key = args[0].toLowerCase();
        String[] parts;
        Date birth;
        switch(args[0]){
            case "-c": {
                synchronized(allPeople){
                    for(int i = 1; i < args.length; i = i+3) {
                        System.out.println(create(
                            args[i],
                            args[i+1],
                            args[i+2]));
                    }
                }
                break;
            }
            case "-u": {
                synchronized (allPeople) {
                    for(int i = 1; i < args.length; i+=4) {
                        update(
                            allPeople.get(Integer.parseInt(args[i])),
                            args[i+1],
                            args[i+2],
                            args[i+3]);
                    }
                }
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        remove(Integer.parseInt(args[i]));
                    }
                }
                break;
            }
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        info(Integer.parseInt(args[i]));
                    }
                }
                break;
            }
        }
    }
    public static int create(String name, String sex, String birthDay) throws ParseException {
        Person person;
        Date birth = new SimpleDateFormat("dd/MM/yyyy").parse(birthDay);
        if (sex.toLowerCase().equals("м")) {
            person = Person.createMale(name, birth);
        } else {
            person = Person.createFemale(name, birth);
        }
        allPeople.add(person);
        return allPeople.size() - 1;
    }

    public static void update(Person person, String name, String sex, String brithDay) throws ParseException {
        Date birth = new SimpleDateFormat("dd/MM/yyyy").parse(brithDay);
        person.setName(name);
        person.setSex(sex.toLowerCase().equals("м") ? Sex.MALE : Sex.FEMALE);
        person.setBirthDay(birth);
    }

    public static void remove(int id){
        Person person = allPeople.get(id);
        person.setName(null);
        person.setBirthDay(null);
        person.setSex(null);
    }

    public static void info(int id) {
        Person person = allPeople.get(id);
        if(person == null) {
            System.out.println("Пользователь был удален");
        } else {
            System.out.println(
                person.getName() + " " +
                (person.getSex().equals(Sex.MALE) ? "м" : "ж") +
                new SimpleDateFormat(" dd-MMM-yyyy",
                        Locale.ENGLISH).format(person.getBirthDay()));
        }
    }
}
