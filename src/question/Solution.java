package question;

import java.util.ArrayList;
import java.util.Stack;

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

    /**
     * 链表数据结构
     */
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

    //////////////////
    ////////////////// 题目3
    //////////////////

    /**
     * 二叉树数据结构
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        int length = pre.length;
        TreeNode root = reConstructBinaryTree(pre, 0, length - 1, in,
                0, length - 1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        int nodeValue = pre[startPre];
        TreeNode treeNode = new TreeNode(nodeValue);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == nodeValue) {
                // 对于nodeValu结点,左结点个数(i - startIn),右结点个数(endIn - i)
                // 对于左结点，in[startIn,i-1]
                // pre起始结点下标(startPre+1)。通过左结点个数，计算尾结点下标(startPre + i - startIn)
                treeNode.left = reConstructBinaryTree(pre, startPre + 1, i - startIn + startPre, in, startIn, i - 1);
                // 对于右结点，in[i+1,endIn]
                // pre尾结点下标(endPre)。通过右结点个数，计算起始结点下标(endPre - endIn + i + 1)
                treeNode.right = reConstructBinaryTree(pre, endPre - endIn + i + 1, endPre, in, i + 1, endIn);
            }
        }
        return treeNode;
    }

    //////////////////
    ////////////////// 题目4
    //////////////////
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    //////////////////
    ////////////////// 题目5
    //////////////////
    public int minNumberInRotateArray(int[] array) {
        int minValue = 0;
        for (int value : array) {
            if (minValue > value) {
                minValue = value;
                break;
            }
            minValue = value;
        }
        return minValue;
    }

    //////////////////
    ////////////////// 题目6
    //////////////////
    // 方法一：使用递归计算（耗时久）
    public int Fibonacci1(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibonacci1(n - 1) + Fibonacci1(n - 2);
    }

    // 方法2：使用循环计算
    public int Fibonacci2(int n) {
        int[] array = {1, 1, 2};
        if (n < 1) {
            return 0;
        } else if (n <= 3) {
            return array[n - 1];
        }
        int flag = 0;
        while (n > 3) {
            array[flag % 3] = array[0] + array[1] + array[2] - array[flag % 3];
            n--;
            flag++;
        }
        return array[(flag - 1) % 3];
    }

    // 方法3：对方法2进行优化
    public int Fibonacci3(int n) {
        if (n < 1) {
            return 0;
        }
        int[] array = {1, 1};
        int flag = 0;
        while (n > 2) {
            array[flag % 2] = array[0] + array[1];
            flag++;
            n--;
        }
        return array[(flag + 1) % 2];
    }

    //////////////////
    ////////////////// 题目7
    //////////////////

    /**
     * 假设第一跳为1，剩下跳法为f(n-1)
     * <p>
     * 假设第一跳为2，剩下跳法为f(n-2)
     * <p>
     * 总的跳法为f(n)=f(n-1)+f(n-2)，即属于斐波那契数列问题。
     *
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        int n = target + 1;
        int[] array = {1, 1};
        int flag = 0;
        while (n > 2) {
            array[flag % 2] = array[0] + array[1];
            flag++;
            n--;
        }
        return array[(flag + 1) % 2];
    }

    //////////////////
    ////////////////// 题目8
    //////////////////

    /**
     * f(n)=f(n-1)+f(n-2)+...+f(n-n);
     * <p>
     * f(0)=1,即一次性跳完所有台阶
     * <p>
     * 总的跳法为f(n)=2^n - 1 + f(0)=2^n
     *
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target <= 1)
            return 1;
        if (target == 2)
            return 2;
        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum += JumpFloorII(i);
        }
        return sum;
    }

    // 对方法1进行归纳分析
    public int JumpFloorII2(int target) {
        return 1 << (target - 1);
    }

    //////////////////
    ////////////////// 题目9
    //////////////////

    /**
     * 假设第一个长条竖着放，剩下放法为f(n-1)
     * <p>
     * 假设第一个长条横着放，剩下放法为f(n-2)
     * <p>
     * 总的放法为f(n)=f(n-1)+f(n-2)，即属于斐波那契数列问题。
     *
     * @param target
     * @return
     */
    public int RectCover(int target) {
        int n = target + 1;
        if (n < 2) {
            return 0;
        }
        int[] array = {1, 1};
        int flag = 0;
        while (n > 2) {
            array[flag % 2] = array[0] + array[1];
            flag++;
            n--;
        }
        return array[(flag + 1) % 2];
    }

}
