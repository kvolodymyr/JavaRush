package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Bob", 34, "New-York");
        Man man2 = new Man("John", 10, "Boston");
        Woman woman1 = new Woman("Julia", 20, "San-Francisco");
        Woman woman2 = new Woman("Sophia", 11, "Chicago");
//        System.out.println(man1);
//        System.out.println(man2);
//        System.out.println(woman1);
//        System.out.println(woman2);
        System.out.println(man1.name + " "+ man1.age + " " + man1.address);
        System.out.println(man2.name + " "+ man2.age + " " + man2.address);
        System.out.println(woman1.name + " "+ woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " "+ woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код
    public static abstract class Person {
        public String name;
        public int age;
        public String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Man extends Person {
        public Man(String name, int age, String address) {
            super(name, age, address);
        }
    }

    public static class Woman extends Person {
        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
    }
}
