package com.grivera64.datastructure.List;

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
        this.capacity = capacity;
        this.size = 0;
        this.arr = (E[]) new Object[capacity];       // Unchecked Cast Compiler Warning, but okay at runtime
    }

    @Override
    public void add(E element) {

    }

    @Override
    public void add(int index, E element) {

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
}
