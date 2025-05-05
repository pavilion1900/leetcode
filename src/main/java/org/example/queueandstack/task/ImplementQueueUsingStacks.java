package org.example.queueandstack.task;

public class ImplementQueueUsingStacks {

//    232. Implement Queue using Stacks
//    Easy
//
//    Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all
//    the functions of a normal queue (push, peek, pop, and empty).
//
//    Implement the MyQueue class:
//
//    void push(int x) Pushes element x to the back of the queue.
//    int pop() Removes the element from the front of the queue and returns it.
//    int peek() Returns the element at the front of the queue.
//    boolean empty() Returns true if the queue is empty, false otherwise.
//
//    Notes:
//
//    You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is
//    empty operations are valid.
//    Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or
//    deque (double-ended queue) as long as you use only a stack's standard operations.

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());  // 1
        System.out.println(queue.pop());   // 1
        System.out.println(queue.peek());  // 2
        queue.push(4);
        queue.push(5);
        System.out.println(queue.peek());  // 2
        System.out.println(queue.pop());   // 2
        System.out.println(queue.empty()); // false
    }
}

class MyQueue {

    public MyQueue() {
    }

    public void push(int x) {
    }

    public int pop() {
        return -1;
    }

    public int peek() {
        return -1;
    }

    public boolean empty() {
        return false;
    }
}
