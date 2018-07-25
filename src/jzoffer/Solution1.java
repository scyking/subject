package jzoffer;

/**
 * 二维数组中的查找
 */
public class Solution1 {

    public boolean find(int target, int[][] array) {
        boolean flag = false;
        LOOP:
        for (int[] arrayone : array) {
            int arrayLength = arrayone.length;
            for (int i = 0; i < arrayLength; i++) {
                if (arrayone[i] > target) {
                    if (i > 0) {
                        // 跳出本次循环
                        break;
                    } else {
                        // 跳出嵌套查询
                        break LOOP;
                    }
                } else if (arrayone[i] == target) {
                    flag = true;
                    // 跳出嵌套查询
                    break LOOP;
                }
            }
        }
        return flag;
    }
}
