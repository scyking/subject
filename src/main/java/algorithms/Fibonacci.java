package algorithms;

/**
 * 斐波那契数列
 * <p>
 * F(0)=0，
 * F(1)=1,
 * F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
 * </p>
 *
 * @author scyking
 **/
public class Fibonacci {

    /**
     * 递归实现
     *
     * @param n
     * @return
     */
    public static int recursion(int n) {
        if (n < 2) {
            return n;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    /**
     * 循环实现
     *
     * @param n
     * @return
     */
    public static int loop(int n) {
        int[] array = {0, 1};
        int index = 0;
        while (n > 1) {
            array[index % 2] = array[0] + array[1];
            index++;
            n--;
        }
        return array[(index - 1) % 2];
    }


}
