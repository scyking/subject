package jzoffer;

import java.util.ArrayList;

/**
 * 栈的压入、弹出序列
 */
public class Solution20 {

    // 模拟操作求解
    public boolean IsPopOrder(int[] pushA, int[] popA) {
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
