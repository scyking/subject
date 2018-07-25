package jzoffer;

import structure.TreeNode;

/**
 * 二叉树的镜像
 */
public class Solution17 {

    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
