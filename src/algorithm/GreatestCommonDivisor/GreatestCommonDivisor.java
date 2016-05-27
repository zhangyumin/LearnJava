package algorithm.GreatestCommonDivisor;

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
 *
 * 输入2个正整数A，B，求A与B的最大公约数。
 * Input
 * 2个数A,B，中间用空格隔开。(1<= A,B <= 10^9)
 * Output
 * 输出A与B的最大公约数。
 */
public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int big = 0;
        int small = 0;
        int c = 0;
        if(a > b){
            big = a;
            small = b;
        }
        else{
            big = b;
            small = a;
        }
        if(big == small){
            System.out.println(big);
        }
        else {
            c = big - small;
            while (c != small) {
                if (c < small) {
                    int tmp = c;
                    c = small;
                    small = tmp;
                }
                c = c - small;
            }
            System.out.println(c);
        }
    }
}
