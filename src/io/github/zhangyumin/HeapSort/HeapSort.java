package io.github.zhangyumin.HeapSort;

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
//最大堆排序
public class HeapSort {
    public int[] heapBuild(int[] a){
        for (int i = a.length - 1; i >= 0; i--) {
            heapAdjust(a, a.length, i);
        }
        return a;
    }

    public void heapAdjust(int[] a,int length, int i){
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if(left < length && a[left] > a[i]){
            max = left;
        }
        if(right < length && a[right] > a[i]){
            max = right;
        }
        if(max != i){
            int tmp = a[i];
            a[i] = a[max];
            a[max] = tmp;
            heapAdjust(a, length, max);
        }
    }

    public void heapSort(int[] a){
        int[] sortedArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sortedArray[i] = a[0];
            a[0] = a[a.length - 1 - i];
            heapAdjust(a, a.length - i, 0);
        }
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void main(String[] args) {
        int[] array = new int[]{12,4,22,45,8,27,13,33};
        HeapSort hs = new HeapSort();
        int[] heapArray = hs.heapBuild(array);
        hs.heapSort(heapArray);
    }
}
