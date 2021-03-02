package jzoffer;
import java.util.Stack;

/**
 * 包含min函数的栈
 * <p>
 *         定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * </p>
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
