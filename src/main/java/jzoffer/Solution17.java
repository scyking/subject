package jzoffer;

import structure.TreeNode;

/**
 * 二叉树的镜像
 * <p>
 *         操作给定的二叉树，将其变换为源二叉树的镜像(所有结点的左右子结点互调位置)。
 * </p>
 */
public class Solution17 {

    public void mirror(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(tmp);
            mirror(root.getLeft());
            mirror(root.getRight());
        }
    }
}
