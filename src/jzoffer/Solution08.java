package jzoffer;

/**
 * 变态跳台阶
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
    public int JumpFloorII1(int target) {
        if (target <= 1)
            return 1;
        if (target == 2)
            return 2;
        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum += JumpFloorII1(i);
        }
        return sum;
    }

    // 对方法1进行归纳分析
    public int JumpFloorII2(int target) {
        return 1 << (target - 1);
    }
}
