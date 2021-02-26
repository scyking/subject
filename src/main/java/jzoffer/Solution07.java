package main.java.jzoffer;

/**
 * 跳台阶
 */
public class Solution07 {

    /**
     * 假设第一跳为1，剩下跳法为f(n-1)
     * <p>
     * 假设第一跳为2，剩下跳法为f(n-2)
     * <p>
     * 总的跳法为f(n)=f(n-1)+f(n-2)，即属于斐波那契数列问题。
     *
     * @param target
     * @return
     */
    public int jumpFloor(int target) {
        int n = target + 1;
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
