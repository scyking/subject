package jzoffer;

/**
 * 变态跳台阶
 *
 * <p>
 *             一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * </p>
 */
public class Solution08 {

    /**
     * f(n)=f(n-1)+f(n-2)+...+f(n-n);
     * <p>
     * f(0)=1,即一次性跳完所有台阶
     * <p>
     * 总的跳法为f(n)=2^n - 1 + f(0)=2^n
     *
     * @param target
     * @return
     */
    public int jumpFloorII1(int target) {
        if (target <= 1)
            return 1;
        if (target == 2)
            return 2;
        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum += jumpFloorII1(i);
        }
        return sum;
    }

    // 对方法1进行归纳分析
    public int jumpFloorII2(int target) {
        return 1 << (target - 1);
    }
}
