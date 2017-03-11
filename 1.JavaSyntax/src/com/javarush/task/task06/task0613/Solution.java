package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
        Cat cat01 = new Cat();
        Cat cat02 = new Cat();
        Cat cat03 = new Cat();
        Cat cat04 = new Cat();
        Cat cat05 = new Cat();
        Cat cat06 = new Cat();
        Cat cat07 = new Cat();
        Cat cat08 = new Cat();
        Cat cat09 = new Cat();
        Cat cat10 = new Cat();
        //выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        //создай статическую переменную catCount
        public static int catCount;
        //создай конструктор
        public Cat() {
            catCount++;
        }
    }
}
