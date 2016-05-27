package io.github.zhangyumin.RadixSort;

import java.util.Arrays;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-5-10.
 */
public class RadixSort {
    public static void execRadixSort(int[] a,int num){
        int index = 1;//比较的位数
        int n = 1;//10^(index-1)
        while(index <= num) {
            int k = 0;
            int[][] tmp = new int[10][a.length];
            int[] order = new int[10];
            for (int i = 0; i < a.length; i++) {
                int l = a[i] / n % 10;
                tmp[l][order[l]] = a[i];
                order[l] += 1;
            }
            for (int i = 0; i < 10; i++) {
                if(order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        a[k] = tmp[i][j];
                        k++;
                    }
                }
            }
            n = n * 10;
            index ++;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] array = new int[]{12,4,22,45,8,27,13,33};
        System.out.println(Arrays.toString(array));
        execRadixSort(array, 2);
    }
}
