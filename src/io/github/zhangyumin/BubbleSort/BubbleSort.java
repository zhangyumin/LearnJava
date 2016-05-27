package io.github.zhangyumin.BubbleSort;

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
public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleArray = new int[]{12,4,22,45,8,27,13,33};
        for (int i = bubbleArray.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1 ; j++) {
                if (bubbleArray[j] > bubbleArray[j+1]){
                    int tmp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j+1];
                    bubbleArray[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(bubbleArray));
    }
}
