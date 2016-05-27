package algorithm.InversionNumber;

import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-5-22.
 *
 * 在一个排列中，如果一对数的前后位置与大小顺序相反，即前面的数大于后面的数，那么它们就称为一个逆序。一个排列中逆序的总数就称为这个排列的逆序数。
 * 如2 4 3 1中，2 1，4 3，4 1，3 1是逆序，逆序数是4。给出一个整数序列，求该序列的逆序数。
 * Input
 * 第1行：N，N为序列的长度（n <= 50000)
 * 第2 - N + 1行：序列中的元素（0 <= A[i] <= 10^9）
 * Output
 * 输出逆序数
 */
public class InversionNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        long[] store = new long[n];
        long tmp = 0;
        int sum = 0;
        int numbersum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] > tmp){
                for (int j = i + 1; j < n; j++) {

                }
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        store[numbersum] = j;
                        numbersum++;
                    }
                }
            }
            sum += numbersum;
            tmp = arr[i];
        }
        System.out.println(sum);
    }
}
