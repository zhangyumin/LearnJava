package io.github.zhangyumin.poker;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-12-3.
 */
public class Player {
    int id;
    String name;
    Set hand = new HashSet<>();
    void add(){
            System.out.println("输入ID:");
            Scanner sc1 = new Scanner(System.in);
            id = sc1.nextInt();
            System.out.println("输入姓名");
            Scanner sc2 = new Scanner(System.in);
            name = sc2.next();
    }
    String getMax(){
        return Collections.max(hand).toString();
    }
    void show(){
        System.out.print(this.name+":[");
        for (Object obj : hand){
            System.out.print(obj+",");
        }
        System.out.println("]");
    }
}
