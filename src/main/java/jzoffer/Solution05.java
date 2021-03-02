package jzoffer;

import java.lang.reflect.Proxy;

/**
 * 旋转数组的最小数字
 *
 * <p>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * </p>
 */
public class Solution05 implements Solution {


    public int minNumberInRotateArray(int[] array) {
        int minValue = 0;
        for (int value : array) {
            if (minValue > value) {
                minValue = value;
                break;
            }
            minValue = value;
        }
        return minValue;
    }

    @Override
    public Object execute() {
        // todo 使用二分法
        int[] array = {3, 4, 5, 1, 2};
        return minNumberInRotateArray(array);
    }

    public static void main(String[] args) {
        Solution solution = new Solution05();
        Solution solutionProxy = (Solution) Proxy.newProxyInstance(
                solution.getClass().getClassLoader(),
                solution.getClass().getInterfaces(),
                new SolutionProxy(solution)
        );
        solutionProxy.execute();
    }
}
