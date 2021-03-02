package jzoffer;
/**
 * 二进制中1的个数
 * <p>
 *         输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * </p>
 */
public class Solution10 {

    // 方法1：通过求模计算
    public int numberOf1_1(int n) {
        int tmp = n;
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1 || n % 2 == -1) {
                count++;
            }
            n = n / 2;
        }
        // 对于负数
        if (tmp < 0) {
            // 原码1的个数(个数+符号位)
            // count + 1
            // 反码1的个数(个数+符号位)
            count = (31 - count) + 1;
            // 补码1的个数
            count = count - tmp % 2;
            int max = 1 << 32 - 1;
            // 进位溢出
            if (tmp == max) {
                count = 1;
            }
        }
        return count;
    }

    // 方法2：通过右移计算
    public int numberOf1_2(int n) {
        int count = 0;
        int flag = 32;
        while (flag > 0) {
            // 判断最后一位是否为1
            if ((n & 1) == 1) {
                count++;
            }
            // 右移
            n = n >> 1;
            flag--;
        }
        return count;
    }

    // 方法3：通过'与'运算
    public int numberOf3(int n) {
        int count = 0;
        while (n != 0) {
            // 去除尾1
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
