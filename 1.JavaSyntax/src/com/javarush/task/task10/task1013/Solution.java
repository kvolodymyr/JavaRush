package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private Human mother;
        private Human father;
        private ArrayList<Human> children;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this(name);
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age) {
            this(name, sex);
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother) {
            this(name, sex, age);
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this(name, sex, age, mother);
            this.father = father;
        }

        public Human(String name, Human mother, Human father) {
            this(name);
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father, ArrayList<Human> children) {
            this(name, sex, age, mother, father);
            this.children = children;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this(name, sex, age);
            this.children = children;
        }

        public Human(String name, ArrayList<Human> children) {
            this(name);
            this.children = children;
        }

        public Human(String name, Human mother, Human father, ArrayList<Human> children) {
            this(name);
            this.mother = mother;
            this.father = father;
            this.children = children;
        }
    }
}
