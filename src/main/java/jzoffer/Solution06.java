package jzoffer;

import algorithms.Fibonacci;

import java.lang.reflect.Proxy;

/**
 * 斐波那契数列
 * <p>
 * 要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * </p>
 *
 * @see Fibonacci
 */
public class Solution06 implements Solution {

    // 方法一：使用递归计算（耗时久）
    public int fibonacci1(int n) {
        return Fibonacci.recursion(n);
    }

    // 方法2：使用循环计算
    public int fibonacci2(int n) {
        int[] array = {1, 1, 2};
        if (n < 1) {
            return 0;
        }
        if (n <= 3) {
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
    public int fibonacci3(int n) {
        return Fibonacci.loop(n);
    }

    @Override
    public Object execute() {
        return fibonacci3(20);
    }

    public static void main(String[] args) {
        Solution solution = new Solution06();
        Solution solutionProxy = (Solution) Proxy.newProxyInstance(
                solution.getClass().getClassLoader(),
                solution.getClass().getInterfaces(),
                new SolutionProxy(solution)
        );
        solutionProxy.execute();
    }
}
