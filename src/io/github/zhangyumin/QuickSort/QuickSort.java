package io.github.zhangyumin.QuickSort;

import java.util.Arrays;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-5-9.
 */
public class QuickSort {

    public void QuickSortExec(int[] a, int left, int right){
        if(left < right) {
            int key = a[left];
            int low = left;
            int high = right;
            while (low < high) {
                while (low < high && a[high] > key) {
                    high--;
                }
                System.out.println("1. " + a[low] + " = " + a[high]);
                a[low] = a[high];
                while (low < high && a[low] < key) {
                    low++;
                }
                System.out.println("2. " + a[high] + " = " + a[low]);
                a[high] = a[low];
            }
            a[low] = key;
            System.out.println(Arrays.toString(a));
            QuickSortExec(a, left, low - 1);
            QuickSortExec(a, high + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] bubbleArray = new int[]{12,4,22,45,8,27,13,33};
        System.out.println(Arrays.toString(bubbleArray));
        QuickSort q = new QuickSort();
        q.QuickSortExec(bubbleArray, 0, bubbleArray.length - 1);
    }
}
