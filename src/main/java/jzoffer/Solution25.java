package jzoffer;
import main.java.structure.TreeNode;

public class Solution25 {

    private TreeNode firstNode = null;
    private TreeNode lastNode = null;

    // 中序遍历
    public TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree != null) {
            convert(pRootOfTree.left);
            if (firstNode == null) {
                firstNode = pRootOfTree;
                lastNode = pRootOfTree;
            } else {
                lastNode.right = pRootOfTree;
                pRootOfTree.left = lastNode;
                lastNode = pRootOfTree;
            }
            convert(pRootOfTree.right);
        }
        return firstNode;
    }
}
