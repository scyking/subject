package jzoffer;

import structure.TreeNode;

import java.util.ArrayList;


/**
 * 二叉树中和为某一值的路径
 * <p>
 *         输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * </p>
 */
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
