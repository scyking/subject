package main.java.jzoffer;

/**
 * 旋转数组的最小数字
 */
public class Solution05 {

    public int minNumberInRotateArray(int[] array) {
        int minValue = 0;
        for (int value : array) {
            if (minValue > value) {
                minValue = value;
                break;
            }
            minValue = value;
        }
        return minValue;
    }
}
