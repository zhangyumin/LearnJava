package algorithm.FindTargetInSortedArray;
/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-8-28.
 */
public class FindTargetInSortedArray {
    public boolean Find(int [][] array,int target) {
        if(array == null){
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        boolean isFind = false;
        int cmpNum;
        while(row <= array.length - 1 && col >= 0){
            cmpNum = array[row][col];
            if(cmpNum == target){
                isFind = true;
                break;
            }
            else if(cmpNum > target){
                col --;
            }else{
                row ++;
            }
        }
        return isFind;
    }

    public static void main(String[] args) {
        int[][] maze = {{1,2,3,7}, {4,5,6,9}, {9,10,11,13}, {12,13,14,15}};
        FindTargetInSortedArray test = new FindTargetInSortedArray();
        System.out.println(test.Find(maze, 5));
    }
}
