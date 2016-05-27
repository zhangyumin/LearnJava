package algorithm.LeastCommonMultiple;

import java.math.BigInteger;
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
 * 输入2个正整数A，B，求A与B的最小公倍数。
 * Input
 * 2个数A,B，中间用空格隔开。(1<= A,B <= 10^9)
 * Output
 * 输出A与B的最小公倍数。
 *
 */
public class LeastCommonMultiple {
    public static long gcd(long a,long b){
        long big = 0;
        long small = 0;
        long c = 0;
        if(a > b){
            big = a;
            small = b;
        }
        else{
            big = b;
            small = a;
        }
        if(big == small){
            return big;
        }
        else {
            c = big - small;
            while (c != small) {
                if (c < small) {
                    long tmp = c;
                    c = small;
                    small = tmp;
                }
                c = c - small;
            }
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long gcd = gcd(a, b);
        long lcm = 0;
        if(gcd != 0) {
            lcm = a * b;
            System.out.println(a + "*" + b + "=" +lcm);
            lcm = lcm / gcd;
        }else{
            lcm = a * b;
        }
        System.out.println(lcm);
    }
}