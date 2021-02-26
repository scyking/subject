package jzoffer;
import main.java.structure.TreeNode;

import java.util.ArrayList;

public class Solution23 {

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        if (root != null) {
            ArrayList<Integer> tmpList = new ArrayList<Integer>();
            tmpList.add(root.val);
            findPath(tmpList, root.val, target, root, resultList);
        }
        return resultList;
    }

    private void findPath(ArrayList<Integer> tmpList, int totalValue,
                          int target, TreeNode treeNode,
                          ArrayList<ArrayList<Integer>> resultList) {
        if (totalValue < target) {
            if (treeNode.left != null) {
                tmpList.add(treeNode.left.val);
                findPath(tmpList, totalValue + treeNode.left.val, target,
                        treeNode.left, resultList);
                tmpList.remove(tmpList.size() - 1);
            }
            if (treeNode.right != null) {
                tmpList.add(treeNode.right.val);
                findPath(tmpList, totalValue + treeNode.right.val, target,
                        treeNode.right, resultList);
                tmpList.remove(tmpList.size() - 1);
            }
        } else if (totalValue == target && treeNode.left == null
                && treeNode.right == null) {
            ArrayList<Integer> result = new ArrayList<Integer>(tmpList);
            resultList.add(result);
        }
    }
}
