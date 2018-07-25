package jzoffer;

import structure.ListNode;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 */
public class Solution02 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        return addListNodeTailToHead(listNode, arrayList);
    }

    private ArrayList<Integer> addListNodeTailToHead(ListNode node, ArrayList<Integer> list) {
        if (null != node) {
            if (node.next != null) {
                // 递归添加尾节点
                addListNodeTailToHead(node.next, list);
            }
            list.add(Integer.valueOf(node.val));
        }
        return list;
    }
}
