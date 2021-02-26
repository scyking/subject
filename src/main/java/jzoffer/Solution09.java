package jzoffer;
/**
 * 矩形覆盖
 */
public class Solution09 {

    /**
     * 假设第一个长条竖着放，剩下放法为f(n-1)
     * <p>
     * 假设第一个长条横着放，剩下放法为f(n-2)
     * <p>
     * 总的放法为f(n)=f(n-1)+f(n-2)，即属于斐波那契数列问题。
     *
     * @param target
     * @return
     */
    public int rectCover(int target) {
        int n = target + 1;
        if (n < 2) {
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
