package jzoffer;
/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class Solution12 {

    public void reOrderArray(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0) {
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] % 2 == 0) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                } else {
                    break;
                }
            }

        }
    }
}
