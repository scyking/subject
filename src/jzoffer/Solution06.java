package jzoffer;

/**
 * 斐波那契数列
 */
public class Solution06 {

    // 方法一：使用递归计算（耗时久）
    public int Fibonacci1(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibonacci1(n - 1) + Fibonacci1(n - 2);
    }

    // 方法2：使用循环计算
    public int Fibonacci2(int n) {
        int[] array = {1, 1, 2};
        if (n < 1) {
            return 0;
        } else if (n <= 3) {
            return array[n - 1];
        }
        int flag = 0;
        while (n > 3) {
            array[flag % 3] = array[0] + array[1] + array[2] - array[flag % 3];
            n--;
            flag++;
        }
        return array[(flag - 1) % 3];
    }

    // 方法3：对方法2进行优化
    public int Fibonacci3(int n) {
        if (n < 1) {
            return 0;
        }
        int[] array = {1, 1};
        int flag = 0;
        while (n > 2) {
            array[flag % 2] = array[0] + array[1];
            flag++;
            n--;
        }
        return array[(flag + 1) % 2];
    }

}
