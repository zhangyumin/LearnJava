package algorithm.PrintMatrix;

import java.util.ArrayList;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-9-3.
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0){
            return result;
        }
        int start = 0;
        while(matrix.length > start * 2 && matrix[0].length > start * 2){
            int endX = matrix[0].length - 1 - start;
            int endY = matrix.length - 1 - start;
            print(matrix, start, endX, endY, result);
            start ++;
        }
        return result;
    }

    public void print(int[][] matrix, int start, int endX, int endY, ArrayList<Integer> result){
        //上行
        for (int i = start; i <= endX; i++) {
            result.add(matrix[start][i]);
        }
        //右列
        if(start <= endX){
            for (int i = start + 1; i <= endY; i++) {
                result.add(matrix[i][endX]);
            }
        }
        //下行
        if(start < endX && start < endY){
            for (int i = endX - 1; i >= start; i--) {
                result.add(matrix[endY][i]);
            }
        }
        //左列
        if(start < endX && start < endY - 1){
            for (int i = endY - 1; i >= start + 1; i--) {
                result.add(matrix[i][start]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix1 = {{1},{5},{9},{13}};
        System.out.println(new PrintMatrix().printMatrix(matrix1));
    }
}
