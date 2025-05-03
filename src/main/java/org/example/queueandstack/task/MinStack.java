package org.example.queueandstack.task;

public class MinStack {

//    155. Min Stack
//    Medium
//
//    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
//    Implement the MinStack class:
//
//    MinStack() initializes the stack object.
//    void push(int val) pushes the element val onto the stack.
//    void pop() removes the element on the top of the stack.
//    int top() gets the top element of the stack.
//    int getMin() retrieves the minimum element in the stack.
//    You must implement a solution with O(1) time complexity for each function.

    public MinStack() {
    }

    public void push(int val) {

    }

    public void pop() {

    }

    public int top() {
        return -1;
    }

    public int getMin() {
        return -1;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin()); // -3
        stack.pop();
        System.out.println(stack.top());    // 0
        System.out.println(stack.getMin()); // -2
    }
}
