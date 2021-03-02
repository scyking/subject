package jzoffer;

/**
 * 不用加减乘除做加法
 *
 * <p>
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * </p>
 */
public class Solution47 {

    // 方法1
    public int add_1(int num1, int num2) {
        // 进位
        int carry = (num1 & num2) << 1;
        // 未进位
        int nocarry = num1 ^ num2;
        while (carry != 0) {
            int carrytmp = (carry & nocarry) << 1;
            int nocarrytmp = carry ^ nocarry;
            carry = carrytmp;
            nocarry = nocarrytmp;
        }
        // 结果：carry|nocarry 在没有进位的情况下为num1与num2的和
        return nocarry;
    }

    // 方法2：简化方法1代码
    public int add_2(int num1, int num2) {
        while (num1 != 0) {
            int tmp = (num1 & num2) << 1;
            num2 = num1 ^ num2;
            num1 = tmp;
        }
        return num2;
    }
}
