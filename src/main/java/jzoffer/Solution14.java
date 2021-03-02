package jzoffer;

import structure.ListNode;

/**
 * 反转链表
 * <p>
 *         输入一个链表，反转链表后，输出新链表的表头。
 * </p>
 */
public class Solution14 {

    public ListNode reverseList(ListNode head) {
        ListNode lastNode = head;
        if (head != null && head.getNext() != null) {
            lastNode = reverseList(head, head.getNext());
            head.setNext(null);
        }
        return lastNode;
    }

    private ListNode reverseList(ListNode head, ListNode nextHead) {
        ListNode lastNode;
        if (nextHead.getNext() != null) {
            lastNode = reverseList(nextHead, nextHead.getNext());
            nextHead.setNext(head);
        } else {
            nextHead.setNext(head);
            lastNode = nextHead;
        }
        return lastNode;
    }
}
