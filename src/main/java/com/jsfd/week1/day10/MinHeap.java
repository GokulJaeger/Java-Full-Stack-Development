package com.jsfd.week1.day10;

public class MinHeap {
    public static void main(String[] arg)  { 
        System.out.println("The Min Heap is "); 
        Min_Heap minHeap = new Min_Heap(7); 
        minHeap.insert(12); 
        minHeap.insert(15); 
        minHeap.insert(30); 
        minHeap.insert(40); 
        minHeap.insert(50); 
        minHeap.insert(90); 
        minHeap.insert(45);
        minHeap.minHeap(); 
        minHeap.display(); 
        System.out.println("The Min val(root node):" + minHeap.remove()); 
    }
}
