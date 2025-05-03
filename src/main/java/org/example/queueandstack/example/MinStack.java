package org.example.queueandstack.example;

import java.util.Stack;

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
//
//    private final Stack<int[]> stack;
//
//    public MinStack() {
//        stack = new Stack<>();
//    }
//
//    public void push(int val) {
//        if (stack.isEmpty()) {
//            stack.push(new int[]{val, val});
//        }
//        int minVal = stack.peek()[1];
//        stack.push(new int[]{val, Math.min(val, minVal)});
//    }
//
//    public void pop() {
//        stack.pop();
//    }
//
//    public int top() {
//        return stack.peek()[0];
//    }
//
//    public int getMin() {
//        return stack.peek()[1];
//    }
//    =====================
//    private final Stack<Integer> stack;
//    private final Stack<Integer> minStack;
//
//    public MinStack() {
//        stack = new Stack<>();
//        minStack = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if (minStack.isEmpty() || val <= minStack.peek()) {
//            minStack.push(val);
//        }
//    }
//
//    public void pop() {
//        if (stack.peek().equals(minStack.peek())) {
//            minStack.pop();
//        }
//        stack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }
//    =====================
    private final Stack<Integer> stack;
    private final Stack<int[]> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val < minStack.peek()[0]) {
            minStack.push(new int[]{val, 1});
        } else if (val == minStack.peek()[0]) {
            minStack.peek()[1]++;
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek()[0])) {
            minStack.peek()[1]--;
        }
        if (minStack.peek()[1] == 0) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek()[0];
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
