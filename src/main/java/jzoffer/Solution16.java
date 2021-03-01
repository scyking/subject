package jzoffer;

import structure.TreeNode;

/**
 * 树的子结构
 */
public class Solution16 {

    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
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
}
