package algorithm.BashGame;

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
 * 有一堆石子共有N个。A B两个人轮流拿，A先拿。每次最少拿1颗，最多拿K颗，拿到最后1颗石子的人获胜。假设A B都非常聪明，拿石子的过程中不会出现失误。给出N和K，问最后谁能赢得比赛。
 * 例如N = 3，K = 2。无论A如何拿，B都可以拿到最后1颗石子。
 * Input
 * 第1行：一个数T，表示后面用作输入测试的数的数量。（1 <= T <= 10000)
 * 第2 - T + 1行：每行2个数N，K。中间用空格分隔。（1 <= N,K <= 10^9)
 * Output
 * 共T行，如果A获胜输出A，如果B获胜输出B。
 */
public class BashGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int max = k + 1;
            if(n % max == 0){
                System.out.println("B");
            }
            else{
                System.out.println("A");
            }
        }
    }
}
