package io.github.zhangyumin.WordMaze;

import java.util.Scanner;
public class WordMaze {


    private static boolean isFind = false;//全局变量，保存是否找到食物单词

    private static boolean[][] flag;//保存访问标记


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int m = scan.nextInt();
            String w = scan.next();
            char[][] maze = new char[n][m];
            flag = new boolean[n][m];//访问标记位
            for(int i = 0 ; i < n ; i++){
                maze[i] = scan.next().toCharArray();
            }
            findStart(n , m , w , maze);
            if(isFind){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scan.close();
    }
    private static void findStart(int n , int m , String w , char[][] maze){
        //遍历结束如果isFind还没有更新为true表示没有找到
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(maze[i][j] == w.charAt(0)){
                    flag[i][j] = true;
                    findNext(w , 1 , i , j , maze);
                    if(isFind) return;   //如果找到直接返回，如果找不到遍历完maze
                }
            }
        }
    }
    private static void findNext(String w, int index, int row, int col , char[][] maze) {
        int n = maze.length;
        int m = maze[0].length;
        if(index == w.length()){
            isFind = true;
            return;
        }
        int nextIndex = index + 1;
         //防止越界
        if(row - 1 >= 0 && !flag[row - 1][col]){
            if(maze[row - 1][col] == w.charAt(index)){
                flag[row - 1][col] = true;
                findNext(w , nextIndex , row - 1 , col , maze);
            }
        }

        if(row + 1 < n && !flag[row + 1][col]){
            if(maze[row + 1][col] == w.charAt(index)){
                flag[row + 1][col] = true;
                findNext(w , nextIndex , row + 1 , col , maze);
            }
        }

        if(col - 1 >= 0 && !flag[row][col - 1]){
            if(maze[row][col - 1] == w.charAt(index)){
                flag[row - 1][col] = true;
                findNext(w , nextIndex , row , col - 1 , maze);
            }
        }
        if(col + 1 < m && !flag[row][col + 1]){
            if(maze[row][col + 1] == w.charAt(index)){
                flag[row][col + 1] = true;
                findNext(w , nextIndex , row , col + 1 , maze);
            }
        }
        flag[row][col] = false;//如果当前节点走不下去，更新为false，重新寻找其他字母
    }
}