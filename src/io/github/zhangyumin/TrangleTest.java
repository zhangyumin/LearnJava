package io.github.zhangyumin;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-4-20.
 */
public class TrangleTest {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 100; i <= 999 ; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            if( (a == b || a == c || b == c) && a*b*c != 0 ){
                if( a + b > c && a + c > b && b + c > a && a - b < c && a - c < b && b - c < a) {
                    j++;
                    System.out.println(a + ":" + b + ":" + c);
                }
            }
        }
        System.out.println("Total : " + j);
    }
}
