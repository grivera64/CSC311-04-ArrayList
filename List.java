//package com.grivera64.datastructure.list;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/16/2022
 * Due Date: 9/22/2022
 * File Name: List.java
 * Description: Represents the "bare-bones" ADT interface for an ArrayList
 */

public interface List<E> {

    void add(E element);                // Adds to last index
    void add(int index, E element);     // Adds to specified index
    E remove(int index);                // Removes at specified index and returns the element
    E get(int index);                   // Gets from specified index without deleting
    void set(int index, E element);     // Replaces the value at the specified index
    int size();                         // Gets the number of elements in the array list
    int indexOf(E element);             // Returns the first index of an element in the list (-1 if not found)
}
