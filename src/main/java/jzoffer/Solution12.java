package jzoffer;
/**
 * 调整数组顺序使奇数位于偶数前面
 * <p>
 *         输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * </p>
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
