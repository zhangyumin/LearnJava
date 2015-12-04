package io.github.zhangyumin.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
public class Poker {
    String[] suit = {"方片","梅花","红桃","黑桃"};
    String[] number = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    List pokers = new ArrayList<>();
    public void init(){
        System.out.println("-----------------创建扑克牌----------------");
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < number.length; j++) {
                String card = suit[i] + number[j];
                pokers.add(card);
            }
        }
        System.out.println("---------------创建扑克牌成功--------------");
        System.out.print("为:[");
        for (Object obj : pokers){
            System.out.print(obj + ",");
        }
        System.out.println("]");
        System.out.println("-----------------开始洗牌----------------");
        Collections.shuffle(pokers);
        System.out.println("----------------洗牌结束-----------------");
    }
    public void deal(Player ply1,Player ply2){
        System.out.println("----------------开始发牌-----------------");
        for (int i = 0; i < 3; i+=2 ) {
            System.out.println("---玩家:"+ply1.name+"-拿牌");
            ply1.hand.add(pokers.get(i));
            System.out.println("---玩家:"+ply2.name+"-拿牌");
            ply2.hand.add(pokers.get(i+1));
        }
        System.out.println("----------------发牌结束-----------------");
    }
}
