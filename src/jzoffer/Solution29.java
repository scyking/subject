package jzoffer;

public class Solution29 {

    // 连续子数组的最大和
    public int findGreatestSumOfSubArray(int[] array) {
        // 记录最大的子数组和
        Integer max = null;
        // 当前子数组和
        int curMax = 0;
        for (int val : array) {
            if (curMax <= 0) {
                // 重置当前子数组和
                curMax = val;
            } else {
                curMax += val;
            }
            // 更新最大的子数组和
            if (max == null || max < curMax) {
                max = curMax;
            }
        }
        return max;
    }
}
