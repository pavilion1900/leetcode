package org.example.queueandstack.example;

import java.util.Stack;

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

//class MyQueue {
//
//    private final Stack<Integer> stack1;
//    private final Stack<Integer> stack2;
//    private int head;
//
//    public MyQueue() {
//        stack1 = new Stack<>();
//        stack2 = new Stack<>();
//    }
//
//    public void push(int x) {
//        if (stack1.isEmpty()) {
//            head = x;
//        }
//        while (!stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//        stack2.push(x);
//        while (!stack2.isEmpty()) {
//            stack1.push(stack2.pop());
//        }
//    }
//
//    public int pop() {
//        int rsl = stack1.pop();
//        if (!stack1.isEmpty()) {
//            head = stack1.peek();
//        }
//        return rsl;
//    }
//
//    public int peek() {
//        return head;
//    }
//
//    public boolean empty() {
//        return stack1.isEmpty();
//    }
//}

class MyQueue {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;
    private int head;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if (stack1.isEmpty()) {
            head = x;
        }
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        return head;
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
