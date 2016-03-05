package book.core.java.BigIntegerLotteryOdds;

import java.math.BigDecimal;
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
 * Created by zym on 16-3-4.
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers in total?");
        int n = scanner.nextInt();

        System.out.println("How many numbers do you have to choose?");
        int k = scanner.nextInt();

        BigInteger top = BigInteger.valueOf(1);
        BigInteger bottom = BigInteger.valueOf(1);

        for(int i = 1; i <= k; i++){
            bottom = bottom.multiply(BigInteger.valueOf(n - i + 1));
            if(i <= k){
                top = top.multiply(BigInteger.valueOf(i));
            }
        }
        BigInteger rate = bottom.divide(top);
        System.out.printf("Your odds are "+rate);
    }
}
