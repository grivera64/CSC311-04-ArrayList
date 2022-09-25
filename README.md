# CSC311-04-ArrayList

A Java implementation of the list data structure using arrays.

## Available Methods (Located in List.java)

    void add(E element);                // Adds to last index
    void add(int index, E element);     // Adds to specified index
    E remove(int index);                // Removes at specified index and returns the element
    E get(int index);                   // Gets from specified index without deleting
    void set(int index, E element);     // Replaces the value at the specified index
    int size();                         // Gets the number of elements in the array list
    int indexOf(E element);             // Returns the first index of an element in the list (-1 if not found)

## How to run ArrayListDriver.java:

1. Clone the repository.
```bash
    $ git clone https://github.com/grivera64/CSC311-04-ArrayList.git
```
2. Compile the .java files
```bash
    $ cd CSC311-04-ArrayList
    $ javac ArrayList.java List.java ArrayListDriver.java
```
3. Run the driver code
```bash
    $ java ArrayListDriver
```

## Author

- Giovanni Rivera ([@grivera64](https://github.com/grivera64))