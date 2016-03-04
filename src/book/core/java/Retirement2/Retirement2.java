package book.core.java.Retirement2;

import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-3.
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much do you want to contribute every year?");
        double contribution = scanner.nextDouble();

        System.out.println("The interest in % ?");
        double interestRate = scanner.nextDouble();

        int years = 0;
        double sum = 0;
        String choice;

        do{
            sum += contribution;
            double interest = contribution * interestRate / 100;
            sum +=interest;
            years ++;
            System.out.println("Now, you earn "+sum+" dollars in "+years+"years, do you want to retire now?(y/n)");
            choice = scanner.next();
        }while(choice.equals("n"));
    }
}
