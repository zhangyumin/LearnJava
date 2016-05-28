package algorithm.MultiplicativeInverse;

import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-5-27.
 *
 * 给出2个数M和N(M < N)，且M与N互质，找出一个数K满足0 < K < N且K * M % N = 1，如果有多个满足条件的，输出最小的。
 * Input
 * 输入2个数M, N中间用空格分隔（1 <= M < N <= 10^9)
 * Output
 * 输出一个数K，满足0 < K < N且K * M % N = 1，如果有多个满足条件的，输出最小的。
 */
public class MultiplicativeInverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if(i * m % n == 1){
                System.out.println(i);
                break;
            }
        }
    }
}
