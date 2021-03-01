package jzoffer;

import structure.ListNode;

/**
 * 合并两个排序的链表
 */
public class Solution15 {

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode listNode = null;
        if (list1 != null && list2 != null) {
            if (list1.getVal() < list2.getVal()) {
                listNode = list1;
                list1 = list1.getNext();
            } else {
                listNode = list2;
                list2 = list2.getNext();
            }
            ListNode lastNode = listNode;
            while (lastNode.getNext() != null) {
                if (list1.getVal() < list2.getVal()) {
                    lastNode.setNext(list1);
                    list1 = list1.getNext();
                } else {
                    lastNode.setNext(list2);
                    list2 = list2.getNext();
                }
                lastNode = lastNode.getNext();
            }
            if (list1 != null) {
                lastNode.setNext(list1);
            } else {
                lastNode.setNext(list2);
            }
        } else {
            listNode = list1 == null ? list2 : list1;
        }
        return listNode;
    }
}
