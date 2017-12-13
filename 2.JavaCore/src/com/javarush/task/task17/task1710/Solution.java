package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String key = args[0].toLowerCase();
        String[] parts;
        Date birth;
        Person person;
        if(key.equals("-c")) {
            birth = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
            if (args[2].toLowerCase().equals("м")) {
                person = Person.createMale(args[1], birth);
            } else {
                person = Person.createFemale(args[1], birth);
            }
            allPeople.add(person);
            System.out.println(allPeople.size() - 1);
        } else if (key.equals("-u")) {
            birth = new SimpleDateFormat("dd/MM/yyyy").parse(args[4]);
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            person.setSex(args[3].toLowerCase().equals("м") ? Sex.MALE : Sex.FEMALE);
            person.setBirthDay(birth);
        } else if (key.equals("-d")) {
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setBirthDay(null);
            person.setSex(null);
        } else if (key.equals("-i")) {
            person = allPeople.get(Integer.parseInt(args[1]));
            if(person == null) {
                System.out.println("Пользователь был удален");
            } else {
                System.out.println(
                    person.getName() + " " +
                    (person.getSex().equals(Sex.MALE) ? "м" : "ж") +
                    new SimpleDateFormat(" dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDay()));
            }
        }
    }
}
