package com.jsfd.week1.day10;

import java.util.ArrayList;

public class MaxHeap {
    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();
        Max_Heap h = new Max_Heap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);
        System.out.println("Max-Heap array: ");
        h.printArray(array, size);
        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
      }
}
