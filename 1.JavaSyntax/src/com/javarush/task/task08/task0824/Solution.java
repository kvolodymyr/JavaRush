package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        // оздай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
        Human child1 = new Human("child1", true, 20);
        Human child2 = new Human("child2", true, 15);
        Human child3 = new Human("child3", true, 22);


        Human pa = new Human("Pa", true, 50, new ArrayList<Human>(Arrays.asList(child1, child2, child3)));
        Human ma = new Human("Ma", true, 40, new ArrayList<Human>(Arrays.asList(child1, child2, child3)));

        Human grandpa1 = new Human("Deda1", true, 90, new ArrayList<Human>(Arrays.asList(pa)));
        Human grandma1 = new Human("Baba1", false, 70, new ArrayList<Human>(Arrays.asList(pa)));
        Human grandpa2 = new Human("Deda2", true, 90, new ArrayList<Human>(Arrays.asList(ma)));
        Human grandma2 = new Human("Baba2", false, 70, new ArrayList<Human>(Arrays.asList(ma)));

        ArrayList<Human> people = new ArrayList<Human>(Arrays.asList(grandpa1, grandma1, grandpa2, grandma2, pa, ma, child1, child2, child3));
        for(Human item : people)
        {
            System.out.println(item);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this(name, sex, age);
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
