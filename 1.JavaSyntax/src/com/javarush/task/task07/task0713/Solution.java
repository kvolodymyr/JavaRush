package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
            if(list.get(i)%3 == 0) list3.add(list.get(i));
            if(list.get(i)%2 == 0) list2.add(list.get(i));
            if(list.get(i)%3 != 0 && list.get(i)%2 != 0) list1.add(list.get(i));
        }

        printList(list);
        printList(list3);
        printList(list2);
        printList(list1);
// not validate code
//        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<Integer> listDiv2 = new ArrayList<Integer>();
//        ArrayList<Integer> listDiv3 = new ArrayList<Integer>();
//        ArrayList<Integer> listOther = new ArrayList<Integer>();
//
//        for(int i = 0; i < 20; i++) {
////            Integer number = Integer.parseInt(breader.readLine());
////            list.add(number);
////            if( number % 3 == 0) {
////                listDiv3.add(number);
////            }
////            if( number % 2 == 0) {-
////                listDiv2.add(number);
////            }
////            if( number % 3 != 0 && number % 2 != 0) {
////                listOther.add(number);
////            }
//            list.add(Integer.parseInt(breader.readLine()));
//        }
//
//        for(int i = 0; i < list.size(); i++) {
//            if( list.get(i) % 3 == 0) {
//                listDiv3.add(list.get(i));
//            }
//            if( list.get(i) % 2 == 0) {
//                listDiv2.add(list.get(i));
//            }
//            if( list.get(i) % 3 != 0 && list.get(i) % 2 != 0) {
//                listOther.add(list.get(i));
//            }
//        }
//
//        printList(listDiv3);
//        System.out.println("----");
//        printList(listDiv2);
//        System.out.println("----");
//        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
