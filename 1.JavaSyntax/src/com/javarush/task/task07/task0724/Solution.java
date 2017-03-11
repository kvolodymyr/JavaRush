package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        // Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
        Human human = null;
        ArrayList<Human> people = new ArrayList<>();

        people.add(new Human("Петр", true, 90));
        people.add(new Human("Елизавета", false, 86));
        people.add(new Human("Прокофий", true, 81));
        people.add(new Human("Евгения", false, 74));
        people.add(new Human("Владимир", true, 65, people.get(1), people.get(0)));
        people.add(new Human("Майя", false, 53, people.get(3), people.get(2)));
        people.add(new Human("Оля", false, 22, people.get(5), people.get(4)));
        people.add(new Human("Надя", false, 25, people.get(5), people.get(4)));
        people.add(new Human("Вова", false, 35, people.get(5), people.get(4)));

        for(Human item : people) {
            System.out.println(item);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















