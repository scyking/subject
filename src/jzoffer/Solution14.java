package jzoffer;

import structure.ListNode;

/**
 * 反转链表
 */
public class Solution14 {

    public ListNode ReverseList(ListNode head) {
        ListNode lastNode = head;
        if (head != null && head.next != null) {
            lastNode = ReverseList(head, head.next);
            head.next = null;
        }
        return lastNode;
    }

    private ListNode ReverseList(ListNode head, ListNode nextHead) {
        ListNode lastNode;
        if (nextHead.next != null) {
            lastNode = ReverseList(nextHead, nextHead.next);
            nextHead.next = head;
        } else {
            nextHead.next = head;
            lastNode = nextHead;
        }
        return lastNode;
    }
}
