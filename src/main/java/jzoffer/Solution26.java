package jzoffer;
import java.util.ArrayList;

/**
 * 字符串的排列
 * <p>
 *     输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 *     输入描述:
 *
 *     > 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * </p>
 */
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
