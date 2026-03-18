package Leetcode;

import java.util.Stack;

public class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element
    public void push(int val) {
        mainStack.push(val);
w
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    // Pop element
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    // Get top element
    public int top() {
        return mainStack.peek();
    }

    // Get minimum element
    public int getMin() {
        return minStack.peek();
    }

    // 🔽 MAIN METHOD (testing ke liye)
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum: " + minStack.getMin()); // -3

        minStack.pop();

        System.out.println("Top: " + minStack.top());       // 0
        System.out.println("Minimum: " + minStack.getMin()); // -2
    }
}
