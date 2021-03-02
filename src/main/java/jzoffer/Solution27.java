package jzoffer;

/**
 *
 * 数组中出现次数超过一半的数字
 * <p>
 *         数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * </p>
 */
public class Solution27 {

    // 数组中出现次数超过一半的数字
    // 方法一:嵌套循环，时间复杂度高
    public int moreThanHalfNum_Solution(int[] array) {
        int result = 0;
        int length = array.length;
        int flag = (length >> 1) + 1;
        Loop:
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                if (array[i] == array[j]) {
                    sum++;
                    if (sum == flag) {
                        result = array[i];
                        break Loop;
                    }
                }
            }
        }
        return result;
    }
}
