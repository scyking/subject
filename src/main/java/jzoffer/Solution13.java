package main.java.jzoffer;

import main.java.structure.ListNode;

/**
 * 链表中倒数第k个结点
 */
public class Solution13 {

    public ListNode findKthToTail(ListNode head, int k) {
        ListNode targetNode = null;
        if (head != null) {
            targetNode = head;
            int flag = 1;
            while (head.next != null) {
                if (flag == k) {
                    targetNode = targetNode.next;
                } else {
                    flag++;
                }
                head = head.next;
            }
            if (flag != k) {
                targetNode = null;
            }
        }
        return targetNode;
    }
}
