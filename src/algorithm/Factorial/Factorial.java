package algorithm.Factorial;

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
 * 输入N求N的阶乘的准确值。
 * Input
 * 输入N(1 <= N <= 10000)
 * Output
 * 输出N的阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger answer = new BigInteger(String.valueOf(1));
        for (int i = n; i > 0; i--) {
            answer = answer.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(answer);
    }
}
