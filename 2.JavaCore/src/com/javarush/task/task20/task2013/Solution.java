package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private static final long serialVersionUID = 1L;

        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeUTF(firstName);
            out.writeUTF(lastName);
            out.writeInt(age);
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = in.readUTF();
            lastName = in.readUTF();
            age = in.readInt();
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            children = (List)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /* Person p = new Person();
        p.firstName = "fn";
        p.lastName = "ln";
        p.mother = new Person();
        p.mother.firstName = "mother_fn";
        p.mother.lastName = "mother_ln";
        p.father = new Person();
        p.father.firstName = "father_fn";
        p.father.lastName = "father_ln";
        p.children = new ArrayList<Person>();
        p.children.add(new Person());
        p.children.get(0).firstName = "child_fn";
        p.children.get(0).lastName = "child_ln";
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D:\\Dev\\Sandbox\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2013\\1.txt"));
        p.writeExternal(o);

        ObjectInputStream i = new ObjectInputStream(new FileInputStream("D:\\Dev\\Sandbox\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2013\\1.txt"));
        p.readExternal(i); */
    }
}
