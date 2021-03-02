package jzoffer;
import java.util.ArrayList;

/**
 * 最小的K个数
 * <p>
 *         输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * </p>
 */
public class Solution28 {

    // 方法一：通过完成一次完整排序，时间复杂度高
    public ArrayList<Integer> getLeastNumbers_Solution_1(int[] input, int k) {
        int length = input.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (k <= length) {
            for (int i = 0; i < length; i++) {
                for (int j = i; j < length; j++) {
                    if (input[i] > input[j]) {
                        int tmp = input[i];
                        input[i] = input[j];
                        input[j] = tmp;
                    }
                }
            }
            while (k > 0) {
                result.add(input[--k]);
            }
        }
        return result;
    }
}
