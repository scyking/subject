package jzoffer;

public class Solution22 {

    public boolean verifySquenceOfBST(int[] sequence) {
        // 规定空数组结果为false
        boolean flag = false;
        if (sequence.length > 0) {
            flag = verifySquenceOfBST(sequence, 0, sequence.length - 1, null);
        }
        return flag;
    }

    private boolean verifySquenceOfBST(int[] sequence, int startIndex, int endIndex, Integer maxValue) {
        boolean flag = true;
        int tmpIndex = endIndex;
        while (flag && endIndex > startIndex && tmpIndex > 0) {
            tmpIndex--;
            if (maxValue != null && sequence[tmpIndex] > maxValue) {
                flag = false;
                break;
            }
            if (sequence[tmpIndex] < sequence[endIndex]) {
                // 左子树 && 右子树
                flag = verifySquenceOfBST(sequence, startIndex, tmpIndex,
                        sequence[endIndex])
                        && verifySquenceOfBST(sequence, tmpIndex + 1,
                        endIndex - 1, null);
            }
        }
        return flag;
    }
}
