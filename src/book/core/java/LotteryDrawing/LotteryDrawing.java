package book.core.java.LotteryDrawing;

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
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to draw?");
        int k = scanner.nextInt();

        System.out.println("what is the highest number?");
        int n = scanner.nextInt();

        int result[] = new int[k];
        int numbers[] = new int[n];
        for(int i = 0;i < n; i++){
            numbers[i] = i;
        }

        int i = 0;
        while(k > 0){
            int number = (int)(n * Math.random());
            result[i] = numbers[number];
            i++;
            k--;
        }
        for(int a : result){
            System.out.println(a);
        }
    }
}
