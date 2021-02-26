package main.java.jzoffer;

import main.java.structure.TreeNode;

import java.util.ArrayList;

public class Solution21 {

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> listResult = new ArrayList<Integer>();
        if (root != null) {
            ArrayList<TreeNode> listTmp = new ArrayList<TreeNode>();
            listTmp.add(root);
            while (!listTmp.isEmpty()) {
                TreeNode firstTreeNode = listTmp.get(0);
                listResult.add(firstTreeNode.val);
                listTmp.remove(0);
                if (firstTreeNode.left != null) {
                    listTmp.add(firstTreeNode.left);
                }
                if (firstTreeNode.right != null) {
                    listTmp.add(firstTreeNode.right);
                }
            }
        }
        return listResult;
    }
}
