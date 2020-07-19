package com.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public  class MyQueue<T> {
    Stack<T> stackNewestOnTop = new Stack<T>();
    Stack<T> stackOldestOnTop = new Stack<T>();
    Queue<Character> queue = new LinkedList<Character>();
   
 
    void printArray(T[] value)
    {
        int i=0;
       while(i<value.length)
       {
           System.out.println(value[i]);
           i++;
       }
    }
    public void enqueue(T value) {
        if(stackNewestOnTop.isEmpty()) {
            stackNewestOnTop.push(value);
            return;
        }
        stackOldestOnTop.push(value);

    }

    public T peek() {
         return stackNewestOnTop.peek();
    }

    public T dequeue() {
        T item = stackNewestOnTop.pop();
        if(stackNewestOnTop.isEmpty()){
            while(!stackOldestOnTop.isEmpty()){
                stackNewestOnTop.push(stackOldestOnTop.pop());
            }
        }
        return item;
    }
}
