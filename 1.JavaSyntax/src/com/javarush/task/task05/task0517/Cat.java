package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name) {
        this.name = name;
        age = 3;
        weight = 5;
        color = "gray";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "gray";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 5;
        color = "gray";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 3;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 3;
    }

    public static void main(String[] args) {

    }
}
