package main.java.jzoffer;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 */
public class Solution18 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 行数
        int row = matrix.length;
        // 列数
        int col = matrix[0].length;
        // 圈数计数
        int num = 1;
        int minRowCol = row < col ? row : col;
        // 相当于除2取整
        int numMaxTmp = minRowCol >> 1;
        // 最大圈数
        int numMax = minRowCol - numMaxTmp;
        // 初始行下标
        int iRow = 0;
        // 初始列下标
        int jCol = 0;
        while (num <= numMax) {
            list.add(matrix[iRow][jCol]);
            // 向右
            while (jCol < col - num) {
                jCol++;
                list.add(matrix[iRow][jCol]);
            }
            // 向下
            while (iRow < row - num) {
                iRow++;
                list.add(matrix[iRow][jCol]);
            }
            // 向左
            while (jCol > num - 1 && iRow + 1 > numMax) {
                jCol--;
                list.add(matrix[iRow][jCol]);
            }
            // 向上
            while (iRow > num && jCol + 1 <= numMaxTmp) {
                iRow--;
                list.add(matrix[iRow][jCol]);
            }
            jCol++;
            num++;
        }
        return list;
    }
}
