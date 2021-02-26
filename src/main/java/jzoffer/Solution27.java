package jzoffer;
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
