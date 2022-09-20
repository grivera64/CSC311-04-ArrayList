package com.grivera64.datastructure.list;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/16/2022
 * Due Date: 9/22/2022
 * File Name: ArrayList.java
 * Description: Implements the ArrayList ADT methods from our "bare-bones" List interface
 */

public class ArrayList<E> implements List<E> {

    private static final int INITIAL_CAPACITY = 10; // Default capacity

    private int size;                               // Number of elements in the ArrayList
    private int capacity;                           // Size of the underlying array
    private E[] arr;                                // Array reference, but not created yet

    /* Constructors */
    public ArrayList() {
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        /* Check for invalid capacities */
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity cannot be less than 1");
        }

        this.capacity = capacity;
        this.size = 0;
        this.arr = (E[]) new Object[capacity];       // Unchecked Cast Compiler Warning, but okay at runtime
    }

    @Override
    public void add(E element) {
        this.add(this.size, element);
    }

    @Override
    public void add(int index, E element) {
        /* Checking if the index is within bounds or would be appended to the end */
        if (index < 0 || this.size < index) {
            throw new IllegalArgumentException("Invalid index!");
        }

        /* Make space if we need more capacity to fit a new element */
        if (this.capacity <= this.size) {
            System.out.println("There isn't space, calling reallocate...");
            this.reallocate();
        }

        /* Shift all indices after index to the right */
        for (int i = this.size; i > index; i--) {
            this.arr[i] = this.arr[i - 1];
        }

        /* Add the last element to the index provided */
        this.arr[index] = element;
        this.size++;
    }

    @SuppressWarnings("unchecked")
    private void reallocate() {
        /* Create a copy of the array that has twice the capacity */
        E[] newArr = (E[]) new Object[this.capacity * 2];
        System.arraycopy(this.arr, 0, newArr, 0, this.capacity); // Similar to memcpy() in C

        /* Update array information to new array */
        this.capacity *= 2;
        this.arr = newArr;
    }

    @Override
    public E remove(int index) {
        /* Checking if the index to remove is within bounds */
        if (index < 0 || this.size <= index) {
            throw new IllegalArgumentException("Invalid Index!");
        }

        /* Remove element and shift rightmost elements to the left by one */
        E tmp = this.arr[index];
        for (int i = index; i < this.size; i++) {
            this.arr[i] = this.arr[i + 1];
        }

        this.size--;
        return tmp;     // Return the removed element
    }

    @Override
    public E get(int index) {
        /* Get the element at the provided index */
        if (index < 0 || this.size <= index) {
            throw new IllegalArgumentException("Invalid Index!");
        }
        return this.arr[index];
    }

    @Override
    public void set(int index, E element) {
        /* Replace the element at index with new element */
        if (index < 0 || this.size <= index) {
            throw new IllegalArgumentException("Invalid Index!");
        }
        this.arr[index] = element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int indexOf(E element) {
        for (int index = 0; index < this.size; index++) {
            if (this.arr[index].equals(element)) {
                return index;
            }
        }
        return -1;
    }

    // Original toString prints out the address location of the object
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        for (int index = 0; index < this.size - 1; index++) {
            s.append(this.arr[index]);
            s.append(", ");
        }

        s.append(this.arr[this.size - 1]);
        s.append('}');
        return s.toString();
    }
}
