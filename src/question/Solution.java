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
        TreeNode root = reConstructBinaryTree(pre, 0, length - 1, in, 0, length - 1);
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

    //////////////////
    ////////////////// 题目10
    //////////////////

    // 方法1：通过求模计算
    public int NumberOf1_1(int n) {
        int tmp = n;
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1 || n % 2 == -1) {
                count++;
            }
            n = n / 2;
        }
        // 对于负数
        if (tmp < 0) {
            // 原码1的个数(个数+符号位)
            // count + 1
            // 反码1的个数(个数+符号位)
            count = (31 - count) + 1;
            // 补码1的个数
            count = count - tmp % 2;
            int max = 1 << 32 - 1;
            // 进位溢出
            if (tmp == max) {
                count = 1;
            }
        }
        return count;
    }

    // 方法2：通过右移计算
    public int NumberOf1_2(int n) {
        int count = 0;
        int flag = 32;
        while (flag > 0) {
            // 判断最后一位是否为1
            if ((n & 1) == 1) {
                count++;
            }
            // 右移
            n = n >> 1;
            flag--;
        }
        return count;
    }

    // 方法3：通过'与'运算
    public int NumberOf3(int n) {
        int count = 0;
        while (n != 0) {
            // 去除尾1
            n = n & (n - 1);
            count++;
        }
        return count;
    }


    //////////////////
    ////////////////// 题目11
    //////////////////

    // 方法1
    public double Power(double base, int exponent) {
        double result = 1;
        if (exponent > 0) {
            while (exponent > 0) {
                result = result * base;
                exponent--;
            }
        } else if (exponent < 0) {
            while (exponent < 0) {
                result = result / base;
                exponent++;
            }
        }
        return result;
    }

    // 方法2
    public double Power2(double base, int exponent) {
        double result = 1;
        int tmp = exponent;
        if (tmp < 0) {
            exponent = -exponent;
        }
        while (exponent > 0) {
            result = result * base;
            exponent--;
        }
        if (tmp < 0) {
            result = 1 / result;
        }
        return result;
    }


    //////////////////
    ////////////////// 题目12
    //////////////////

    public void reOrderArray(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0) {
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] % 2 == 0) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                } else {
                    break;
                }
            }

        }
    }

    //////////////////
    ////////////////// 题目13
    //////////////////

    public ListNode FindKthToTail(ListNode head, int k) {
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

    //////////////////
    ////////////////// 题目14
    //////////////////

    public ListNode ReverseList(ListNode head) {
        ListNode lastNode = head;
        if (head != null && head.next != null) {
            lastNode = ReverseList(head, head.next);
            head.next = null;
        }
        return lastNode;
    }

    public ListNode ReverseList(ListNode head, ListNode nextHead) {
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

    //////////////////
    ////////////////// 题目15
    //////////////////

    public ListNode Merge(ListNode list1, ListNode list2) {
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

    //////////////////
    ////////////////// 题目16
    //////////////////

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag = false;
        if (root2 != null) {
            flag = traSubtree(root1, root2);
        }
        return flag;
    }

    // 遍历root1，寻找比较点。
    private boolean traSubtree(TreeNode root1, TreeNode root2) {
        if (root1 != null) {
            if (root1.val == root2.val) {
                if (comSubtree(root1, root2)) {
                    return true;
                }
            }
            return traSubtree(root1.left, root2)
                    || traSubtree(root1.right, root2);
        } else {
            return false;
        }
    }

    // 比较二叉树，值是否完全一致（判断root1包含root2）。
    private boolean comSubtree(TreeNode root1, TreeNode root2) {
        if (root2 != null) {
            if (root1 != null) {
                if (root2.val == root1.val) {
                    return comSubtree(root1.left, root2.left)
                            && comSubtree(root1.right, root2.right);
                }
            }
            return false;
        }
        return true;
    }

    //////////////////
    ////////////////// 题目17
    //////////////////

    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }

    //////////////////
    ////////////////// 题目18
    //////////////////
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 行数
        int row = matrix.length;
        // 列数
        int col = matrix[0].length;
        // 圈数计数
        int num = 1;
        int minRowCol = row < col ? row : col;
        // 相当于除2取整
        int numMaxTmp = minRowCol >> 1;
        // 最大圈数
        int numMax = minRowCol - numMaxTmp;
        // 初始行下标
        int iRow = 0;
        // 初始列下标
        int jCol = 0;
        while (num <= numMax) {
            list.add(matrix[iRow][jCol]);
            // 向右
            while (jCol < col - num) {
                jCol++;
                list.add(matrix[iRow][jCol]);
            }
            // 向下
            while (iRow < row - num) {
                iRow++;
                list.add(matrix[iRow][jCol]);
            }
            // 向左
            while (jCol > num - 1 && iRow + 1 > numMax) {
                jCol--;
                list.add(matrix[iRow][jCol]);
            }
            // 向上
            while (iRow > num && jCol + 1 <= numMaxTmp) {
                iRow--;
                list.add(matrix[iRow][jCol]);
            }
            jCol++;
            num++;
        }
        return list;
    }


    //////////////////
    ////////////////// 题目19
    //////////////////

    // 包含min函数的栈(遍历方式时间复杂度是Ο(n))
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();

    public void push1(int node) {
        stack.push(node);
        Integer minTmp = node;
        if (minstack.size() > 0) {
            Integer top = minstack.peek();
            if (top < node) {
                minTmp = top;
            }
        }
        minstack.push(minTmp);

    }

    public void pop1() {
        minstack.pop();
        stack.pop();
    }

    public int min() {
        return minstack.peek();
    }

    //////////////////
    ////////////////// 题目20
    //////////////////
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        boolean flag = true;
        int pushALength = pushA.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int popAIndex = 0;
        for (int i = 0; i < pushALength; i++) {
            if (popA[popAIndex] == pushA[i]) {
                list.add(i);
                popAIndex++;
            }
        }
        int pushAIndex = pushA.length - 1;
        if (list.size() != pushALength) {
            Loop:
            for (int i = popAIndex; i < pushALength; i++) {
                while (pushAIndex >= 0) {
                    int lastIndex = list.size() - 1;
                    if (lastIndex >= 0 && list.get(lastIndex) == pushAIndex) {
                        list.remove(lastIndex);
                        pushAIndex--;
                    } else if (popA[i] == pushA[pushAIndex]) {
                        pushAIndex--;
                        break;
                    } else {
                        flag = false;
                        break Loop;
                    }
                }
            }
        }
        return flag;
    }

}
