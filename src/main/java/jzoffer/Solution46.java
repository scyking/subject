package jzoffer;

/**
 * 求1+2+3+...+n
 *
 * <p>
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * </p>
 */
public class Solution46 {

    // 方法1：利用公式
    public int sum_Solution_1(int n) {
        int sum = (int) Math.pow(n, 2) + n;
        return sum >> 1;
    }

    // 方法2：利用“与”短路特性
    public int sum_Solution_2(int n) {
        int sum = n;
        boolean b = n > 0 && (sum += sum_Solution_2(n - 1)) > 0;
        return sum;
    }
}
