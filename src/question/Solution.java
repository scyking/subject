package question;

import java.util.ArrayList;

/**
 * 问题解决方法
 */
public class Solution {

    //////////////////
    ////////////////// 题目1
    //////////////////
    public boolean find(int target, int[][] array) {
        boolean flag = false;
        LOOP:
        for (int[] arrayone : array) {
            int arrayLength = arrayone.length;
            for (int i = 0; i < arrayLength; i++) {
                if (arrayone[i] > target) {
                    if (i > 0) {
                        // 跳出本次循环
                        break;
                    } else {
                        // 跳出嵌套查询
                        break LOOP;
                    }
                } else if (arrayone[i] == target) {
                    flag = true;
                    // 跳出嵌套查询
                    break LOOP;
                }
            }
        }
        return flag;
    }

    //////////////////
    ////////////////// 题目2
    //////////////////
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        return addListNodeTailToHead(listNode, arrayList);
    }

    public ArrayList<Integer> addListNodeTailToHead(ListNode node, ArrayList<Integer> list) {
        if (null != node) {
            if (node.next != null) {
                list = addListNodeTailToHead(node.next, list);
            }
            list.add(Integer.valueOf(node.val));
        }
        return list;
    }


}
