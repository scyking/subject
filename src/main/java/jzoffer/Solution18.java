package jzoffer;
import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 * <p>
 *         输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * </p>
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
