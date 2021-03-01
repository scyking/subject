package jzoffer;

import structure.TreeNode;

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
