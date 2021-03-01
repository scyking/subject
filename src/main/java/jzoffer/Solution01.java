package jzoffer;

import java.lang.reflect.Proxy;

/**
 * 二维数组中的查找
 *
 * <p>在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入
 * 这样的一个二维数组和一个整数，判断数组中是否含有该整数。</p>
 *
 * @author scyking
 */
public class Solution01 implements Solution {

    private boolean find(int target, int[][] array) {
        boolean flag = false;
        LOOP:
        for (int[] arrayOne : array) {
            int arrayLength = arrayOne.length;
            for (int i = 0; i < arrayLength; i++) {
                if (arrayOne[i] > target) {
                    if (i > 0) {
                        // 跳出本次循环
                        break;
                    } else {
                        // 跳出嵌套查询
                        break LOOP;
                    }
                } else if (arrayOne[i] == target) {
                    flag = true;
                    // 跳出嵌套查询
                    break LOOP;
                }
            }
        }
        return flag;
    }

    @Override
    public Object execute() {
        int target = 7;
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};

        return find(target, array);
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        Solution solutionProxy = (Solution) Proxy.newProxyInstance(
                solution.getClass().getClassLoader(),
                solution.getClass().getInterfaces(),
                new SolutionProxy(solution));
        solutionProxy.execute();
    }

}
