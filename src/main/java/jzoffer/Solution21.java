package jzoffer;


import structure.TreeNode;

import java.util.ArrayList;

public class Solution21 {

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> listResult = new ArrayList<Integer>();
        if (root != null) {
            ArrayList<TreeNode> listTmp = new ArrayList<TreeNode>();
            listTmp.add(root);
            while (!listTmp.isEmpty()) {
                TreeNode firstTreeNode = listTmp.get(0);
                listResult.add(firstTreeNode.getVal());
                listTmp.remove(0);
                if (firstTreeNode.getLeft() != null) {
                    listTmp.add(firstTreeNode.getLeft());
                }
                if (firstTreeNode.getRight() != null) {
                    listTmp.add(firstTreeNode.getRight());
                }
            }
        }
        return listResult;
    }
}
