package main.java.jzoffer;

import main.java.structure.ListNode;

/**
 * 合并两个排序的链表
 */
public class Solution15 {

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode listNode = null;
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                listNode = list1;
                list1 = list1.next;
            } else {
                listNode = list2;
                list2 = list2.next;
            }
            ListNode lastNode = listNode;
            while (lastNode.next != null) {
                if (list1.val < list2.val) {
                    lastNode.next = list1;
                    list1 = list1.next;
                } else {
                    lastNode.next = list2;
                    list2 = list2.next;
                }
                lastNode = lastNode.next;
            }
            if (list1 != null) {
                lastNode.next = list1;
            } else {
                lastNode.next = list2;
            }
        } else {
            listNode = list1 == null ? list2 : list1;
        }
        return listNode;
    }
}
