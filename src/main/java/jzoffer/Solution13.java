package jzoffer;

import structure.ListNode;

/**
 * 链表中倒数第k个结点
 * <p>
 *         输入一个链表，输出该链表中倒数第k个结点。
 * </p>
 */
public class Solution13 {

    public ListNode findKthToTail(ListNode head, int k) {
        ListNode targetNode = null;
        if (head != null) {
            targetNode = head;
            int flag = 1;
            while (head.getNext() != null) {
                if (flag == k) {
                    targetNode = targetNode.getNext();
                } else {
                    flag++;
                }
                head = head.getNext();
            }
            if (flag != k) {
                targetNode = null;
            }
        }
        return targetNode;
    }
}
