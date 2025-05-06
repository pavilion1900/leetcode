package org.example.queueandstack.task;

public class ImplementStackUsingQueues {

//    225. Implement Stack using Queues
//    Easy
//
//    Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all
//    the functions of a normal stack (push, top, pop, and empty).
//
//    Implement the MyStack class:
//
//    void push(int x) Pushes element x to the top of the stack.
//    int pop() Removes the element on the top of the stack and returns it.
//    int top() Returns the element on the top of the stack.
//    boolean empty() Returns true if the stack is empty, false otherwise.
//
//    Notes:
//
//    You must use only standard operations of a queue, which means that only push to back, peek/pop from front,
//    size and is empty operations are valid.
//    Depending on your language, the queue may not be supported natively. You may simulate a queue using a list
//    or deque (double-ended queue) as long as you use only a queue's standard operations.

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());   // 3
        System.out.println(stack.pop());   // 3
        System.out.println(stack.pop());   // 2
        System.out.println(stack.pop());   // 1
        System.out.println(stack.empty()); // true
    }
}

class MyStack {

    public MyStack() {
    }

    public void push(int x) {
    }

    public int pop() {
        return -1;
    }

    public int top() {
        return -1;
    }

    public boolean empty() {
        return false;
    }
}
