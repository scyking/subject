package jzoffer;

import structure.TreeNode;

/**
 * 二叉树的镜像
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
