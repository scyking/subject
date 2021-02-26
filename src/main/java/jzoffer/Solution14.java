package main.java.jzoffer;

import main.java.structure.ListNode;

/**
 * 反转链表
 */
public class Solution14 {

    public ListNode reverseList(ListNode head) {
        ListNode lastNode = head;
        if (head != null && head.next != null) {
            lastNode = reverseList(head, head.next);
            head.next = null;
        }
        return lastNode;
    }

    private ListNode reverseList(ListNode head, ListNode nextHead) {
        ListNode lastNode;
        if (nextHead.next != null) {
            lastNode = reverseList(nextHead, nextHead.next);
            nextHead.next = head;
        } else {
            nextHead.next = head;
            lastNode = nextHead;
        }
        return lastNode;
    }
}
