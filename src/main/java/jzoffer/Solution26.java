package main.java.jzoffer;

import java.util.ArrayList;

public class Solution26 {

    // 字符串的排列
    public ArrayList<String> permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();
        char[] chars = str.toCharArray();
        if (chars.length > 0) {
            chars = sortChars(chars);
            result.add(String.valueOf(chars));
            permutation(chars, 0, result);
        }
        return result;
    }

    public void permutation(char[] chars, int index, ArrayList<String> result) {
        int flagIndex = index + 1;
        while (flagIndex < chars.length + 1) {
            // 排除重复字母
            if (flagIndex < chars.length && chars[index] == chars[flagIndex]) {
                flagIndex++;
                continue;
            }
            // 避免chars中字母顺序在递归过程中被打乱
            char[] clone = chars.clone();
            permutation(clone, index + 1, result);
            if (flagIndex < chars.length) {
                char tmp = chars[index];
                chars[index] = chars[flagIndex];
                chars[flagIndex] = tmp;
                result.add(String.valueOf(chars));
            }
            flagIndex++;
        }
    }

    // 未考虑大小写同时输入
    private char[] sortChars(char[] chars) {
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (chars[i] > chars[j]) {
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                }
            }
        }
        return chars;
    }

}
