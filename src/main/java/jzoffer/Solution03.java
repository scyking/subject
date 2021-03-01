package jzoffer;


import structure.TreeNode;

import java.lang.reflect.Proxy;

/**
 * 重建二叉树
 *
 * <p>
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * </p>
 */
public class Solution03 implements Solution {

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
                treeNode.setLeft(
                        reConstructBinaryTree(pre, startPre + 1, i - startIn + startPre, in, startIn, i - 1)
                );
                // 对于右结点，in[i+1,endIn]
                // pre尾结点下标(endPre)。通过右结点个数，计算起始结点下标(endPre - endIn + i + 1)
                treeNode.setRight(
                        reConstructBinaryTree(pre, endPre - endIn + i + 1, endPre, in, i + 1, endIn)
                );
            }
        }
        return treeNode;
    }

    @Override
    public Object execute() {
        // [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
        int[] pre = {1, 2, 3, 4, 5, 6, 7};
        int[] in = {3, 2, 4, 1, 6, 5, 7};
        return reConstructBinaryTree(pre, in);
    }

    public static void main(String[] args) {
        Solution solution = new Solution03();
        Solution solutionProxy = (Solution) Proxy.newProxyInstance(
                solution.getClass().getClassLoader(),
                solution.getClass().getInterfaces(),
                new SolutionProxy(solution)
        );
        solutionProxy.execute();
    }

}
