package jzoffer;

import structure.TreeNode;

/**
 * 二叉搜索树与双向链表
 * <p>
 *         输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * </p>
 */
public class Solution25 {

    private TreeNode firstNode = null;
    private TreeNode lastNode = null;

    // 中序遍历
    public TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree != null) {
            convert(pRootOfTree.getLeft());
            if (firstNode == null) {
                firstNode = pRootOfTree;
                lastNode = pRootOfTree;
            } else {
                lastNode.setRight(pRootOfTree);
                pRootOfTree.setLeft(lastNode);
                lastNode = pRootOfTree;
            }
            convert(pRootOfTree.getRight());
        }
        return firstNode;
    }
}
