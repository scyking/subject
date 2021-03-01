package jzoffer;

import structure.ListNode;

import java.lang.reflect.Proxy;
import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * <p>
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * </p>
 */
public class Solution02 implements Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        return addListNodeTailToHead(listNode, arrayList);
    }

    private ArrayList<Integer> addListNodeTailToHead(ListNode node, ArrayList<Integer> list) {
        if (null != node) {
            if (node.getNext() != null) {
                // 递归添加尾节点
                addListNodeTailToHead(node.getNext(), list);
            }
            list.add(node.getVal());
        }
        return list;
    }

    @Override
    public Object execute() {
        // {67,0,24,58}
        ListNode head = new ListNode(67);
        head.next(0).next(24).next(58);
        return printListFromTailToHead(head);
    }

    public static void main(String[] args) {
        Solution solution = new Solution02();
        Solution solutionProxy = (Solution) Proxy.newProxyInstance(
                solution.getClass().getClassLoader(),
                solution.getClass().getInterfaces(),
                new SolutionProxy(solution)
        );
        solutionProxy.execute();
    }

}
