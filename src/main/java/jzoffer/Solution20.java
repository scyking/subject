package jzoffer;
import java.util.ArrayList;

/**
 * 栈的压入、弹出序列
 * <p>
 *         输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * </p>
 */
public class Solution20 {

    // 模拟操作求解
    public boolean isPopOrder(int[] pushA, int[] popA) {
        boolean flag = true;
        int pushALength = pushA.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int popAIndex = 0;
        for (int i = 0; i < pushALength; i++) {
            if (popA[popAIndex] == pushA[i]) {
                list.add(i);
                popAIndex++;
            }
        }
        int pushAIndex = pushA.length - 1;
        if (list.size() != pushALength) {
            Loop:
            for (int i = popAIndex; i < pushALength; i++) {
                while (pushAIndex >= 0) {
                    int lastIndex = list.size() - 1;
                    if (lastIndex >= 0 && list.get(lastIndex) == pushAIndex) {
                        list.remove(lastIndex);
                        pushAIndex--;
                    } else if (popA[i] == pushA[pushAIndex]) {
                        pushAIndex--;
                        break;
                    } else {
                        flag = false;
                        break Loop;
                    }
                }
            }
        }
        return flag;
    }
}
