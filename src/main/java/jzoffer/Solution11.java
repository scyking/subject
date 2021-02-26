package jzoffer;
/**
 * 数值的整数次方
 */
public class Solution11 {

    // 方法1
    public double power(double base, int exponent) {
        double result = 1;
        if (exponent > 0) {
            while (exponent > 0) {
                result = result * base;
                exponent--;
            }
        } else if (exponent < 0) {
            while (exponent < 0) {
                result = result / base;
                exponent++;
            }
        }
        return result;
    }

    // 方法2
    public double power2(double base, int exponent) {
        double result = 1;
        int tmp = exponent;
        if (tmp < 0) {
            exponent = -exponent;
        }
        while (exponent > 0) {
            result = result * base;
            exponent--;
        }
        if (tmp < 0) {
            result = 1 / result;
        }
        return result;
    }
}
