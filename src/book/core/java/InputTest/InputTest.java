package book.core.java.InputTest;

import java.io.Console;
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
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("what's your name?");
        String name = in.nextLine();
        System.out.println("how old are you?");
        int age = in.nextInt();
        System.out.println("hello, "+ name +".Next year, you will be "+(age + 1));
//        Console con = System.console();
//        String username = con.readLine("User name: ");
//        char[] password = con.readPassword("Password: ");
//        System.out.println("Name: "+username+"Password:"+password);
    }
}
