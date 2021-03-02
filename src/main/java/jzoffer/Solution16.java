package jzoffer;

import structure.TreeNode;

/**
 * 树的子结构
 * <p>
 *         输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * </p>
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
            if (root1.getVal() == root2.getVal()) {
                if (comSubtree(root1, root2)) {
                    return true;
                }
            }
            return traSubtree(root1.getLeft(), root2)
                    || traSubtree(root1.getLeft(), root2);
        } else {
            return false;
        }
    }

    // 比较二叉树，值是否完全一致（判断root1包含root2）。
    private boolean comSubtree(TreeNode root1, TreeNode root2) {
        if (root2 != null) {
            if (root1 != null) {
                if (root2.getVal() == root1.getVal()) {
                    return comSubtree(root1.getLeft(), root2.getLeft())
                            && comSubtree(root1.getRight(), root2.getRight());
                }
            }
            return false;
        }
        return true;
    }
}
