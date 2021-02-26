package main.java.jzoffer;

import main.java.structure.TreeNode;

/**
 * 重建二叉树
 */
public class Solution03 {

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
}
