package com.grivera64.datastructure.list;

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

        /* Checking params */
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
        arr[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    private void reallocate() {
        /* Create a copy of the array that has twice the capacity */
        E[] newArr = (E[]) new Object[this.capacity * 2];
        System.arraycopy(arr, 0, newArr, 0, this.capacity); // Similar to memcpy() in C

        /* Update array information to new array */
        this.capacity *= 2;
        this.arr = newArr;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(E element, int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override                       // Original prints out the address location of the object
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        for (int index = 0; index < this.size - 1; index++) {
            s.append(this.arr[index]);
            s.append(", ");
        }

        s.append(this.arr[size - 1]);
        s.append('}');
        return s.toString();
    }
}
