package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
//        Iterator<Cat> iterator = cats.iterator();
//        while(iterator.hasNext())
//        {
//            Cat cat = iterator.next();
//            if(cat.name == "Rihanna")
//            {
//                iterator.remove();
//            }
//        }
        Iterator<Cat> iterator = cats.iterator();
        if(iterator.hasNext()) {
            iterator.next();
            if(iterator.hasNext())
            {
                cats.remove(iterator.next());
            }
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> cats = new HashSet<Cat>();
//        cats.add(new Cat("Lucky"));
//        cats.add(new Cat("Betty"));
//        cats.add(new Cat("Rihanna"));
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for(Cat cat : cats)
        {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat
    {
        public Cat()
        {
        }

//        public String name;
//
//        public Cat(String name)
//        {
//            this.name = name;
//        }
//
//        public String toString()
//        {
//            return name;
//        }
    }
}
