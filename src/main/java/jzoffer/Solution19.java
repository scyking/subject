package main.java.jzoffer;

import java.util.Stack;

/**
 * 包含min函数的栈
 */
public class Solution19 {

    // 包含min函数的栈(遍历方式时间复杂度是Ο(n))
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
        Integer minTmp = node;
        if (minstack.size() > 0) {
            Integer top = minstack.peek();
            if (top < node) {
                minTmp = top;
            }
        }
        minstack.push(minTmp);
    }

    public void pop() {
        minstack.pop();
        stack.pop();
    }

    public int min() {
        return minstack.peek();
    }
}
