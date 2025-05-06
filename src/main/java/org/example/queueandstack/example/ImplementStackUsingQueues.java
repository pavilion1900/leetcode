package org.example.queueandstack.example;

import java.util.LinkedList;
import java.util.Queue;

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

//class MyStack {
//
//    private Queue<Integer> queue1;
//    private Queue<Integer> queue2;
//    private int top;
//
//    public MyStack() {
//        queue1 = new LinkedList<>();
//        queue2 = new LinkedList<>();
//    }
//
//    public void push(int x) {
//        queue1.add(x);
//        top = x;
//    }
//
//    public int pop() {
//        while (queue1.size() > 1) {
//            top = queue1.remove();
//            queue2.add(top);
//        }
//        int rsl = queue1.remove();
//        Queue<Integer> tmp = queue1;
//        queue1 = queue2;
//        queue2 = tmp;
//        return rsl;
//    }
//
//    public int top() {
//        return top;
//    }
//
//    public boolean empty() {
//        return queue1.isEmpty();
//    }
//}

class MyStack {

    private final Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.remove());
            size--;
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
