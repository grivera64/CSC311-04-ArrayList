package com.grivera64.datastructure.list;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/16/2022
 * Due Date: 9/22/2022
 * File Name: ArrayListDriver.java
 * Description: Tests our ArrayList implementation
 */

public class ArrayListDriver {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>(1);

        list.add(10);
        System.out.println(list);
        list.add(20);
        System.out.println(list);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.add(50);
        System.out.println(list);
        list.add(1, 100);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        Integer value = list.get(0);
        System.out.printf("The value at location %d is: %d\n", 0, value);

        System.out.println(list);
        list.set(0, 99);
        System.out.println(list);

        System.out.printf("The index of %d is %d\n", 30, list.indexOf(30));
        System.out.printf("The index of %d is %d\n", 8, list.indexOf(8));
    }
}
