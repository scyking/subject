package jzoffer;

import structure.TreeNode;

import java.util.ArrayList;

public class Solution23 {

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        if (root != null) {
            ArrayList<Integer> tmpList = new ArrayList<Integer>();
            tmpList.add(root.getVal());
            findPath(tmpList, root.getVal(), target, root, resultList);
        }
        return resultList;
    }

    private void findPath(ArrayList<Integer> tmpList, int totalValue,
                          int target, TreeNode treeNode,
                          ArrayList<ArrayList<Integer>> resultList) {
        if (totalValue < target) {
            if (treeNode.getLeft() != null) {
                tmpList.add(treeNode.getLeft().getVal());
                findPath(tmpList, totalValue + treeNode.getLeft().getVal(), target,
                        treeNode.getLeft(), resultList);
                tmpList.remove(tmpList.size() - 1);
            }
            if (treeNode.getRight() != null) {
                tmpList.add(treeNode.getRight().getVal());
                findPath(tmpList, totalValue + treeNode.getRight().getVal(), target,
                        treeNode.getRight(), resultList);
                tmpList.remove(tmpList.size() - 1);
            }
        } else if (totalValue == target && treeNode.getLeft() == null
                && treeNode.getRight() == null) {
            ArrayList<Integer> result = new ArrayList<Integer>(tmpList);
            resultList.add(result);
        }
    }
}
