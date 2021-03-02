package jzoffer;

import java.lang.reflect.Proxy;
import java.util.Stack;

/**
 * 用两个栈实现队列
 *
 * <p>
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * </p>
 */
public class Solution04 implements Solution {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        System.out.println("push:" + node);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int value = stack2.pop();
        System.out.println("pop:" + value);
        return value;
    }

    @Override
    public Object execute() {
        this.push(1);
        this.push(2);
        this.push(3);
        this.pop();
        this.pop();
        this.pop();
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution04();
        Solution solutionProxy = (Solution) Proxy.newProxyInstance(
                solution.getClass().getClassLoader(),
                solution.getClass().getInterfaces(),
                new SolutionProxy(solution)
        );
        solutionProxy.execute();
    }
}
