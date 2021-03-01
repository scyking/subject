package structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringJoiner;

/**
 * 二叉树数据结构
 */
public class TreeNode {

    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int x) {
        val = x;
        this.left = null;
        this.right = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    /**
     * 非递归前序遍历
     *
     * <p>
     * 使用栈结构（FILO）实现
     * </p>
     *
     * @return 遍历结果
     */
    private String preOrderTraversal() {
        TreeNode root = this;
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            sj.add(String.valueOf(root.val));
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return sj.toString();
    }

    /**
     * 非递归中序遍历
     *
     * @return 遍历结果
     */
    private String middleOrderTraversal() {
        TreeNode root = this;
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                sj.add(String.valueOf(root.val));
                root = root.right;
            }
        }
        return sj.toString();
    }

    /**
     * 非递归后序遍历
     *
     * @return 遍历结果
     */
    private String lastOrderTraversal() {
        TreeNode root = this;
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Stack<TreeNode> stack = new Stack<>();
        // 标记最后访问节点
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                if (root.right == null || root.right == prev) {
                    sj.add(String.valueOf(root.val));
                    prev = root;
                    root = null;
                } else {
                    stack.push(root);
                    root = root.right;
                }
            }
        }
        return sj.toString();
    }

    /**
     * 层级遍历
     *
     * @return 遍历结果
     */
    private String levelOrderTraversal() {
        TreeNode root = this;
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            sj.add(String.valueOf(root.val));
            if (root.left != null) {
                queue.offer(root.left);
            }
            if (root.right != null) {
                queue.offer(root.right);
            }

        }
        return sj.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("pre:").append(preOrderTraversal()).append("\n");
        sb.append("middle:").append(middleOrderTraversal()).append("\n");
        sb.append("last:").append(lastOrderTraversal()).append("\n");
        sb.append("level:").append(levelOrderTraversal()).append("\n");
        return sb.toString();
    }
}
