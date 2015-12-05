package io.github.zhangyumin.poker;

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
public class Run {
    public static void main(String args[]){
        Poker pk = new Poker();
        pk.init();
        System.out.println("请输入第1名玩家的ID和姓名");
        Player ply1 = new Player();
        ply1.add();
        System.out.println("请输入第2名玩家的ID和姓名");
        Player ply2 = new Player();
        ply2.add();
        System.out.println("---欢迎玩家:" + ply1.name);
        System.out.println("---欢迎玩家:" + ply2.name);
        pk.deal(ply1,ply2);
        String m1 = ply1.getMax();
        System.out.println(ply1.name+"的最大手牌是"+m1);
        String m2 = ply2.getMax();
        System.out.println(ply2.name+"的最大手牌是"+m2);
        int compare = m1.compareTo(m2);
        System.out.println("--------玩家"+((compare>0)?ply1.name:ply2.name)+"获胜!---------");
        System.out.println("玩家各自的手牌是:");
        ply1.show();
        ply2.show();
    }
}
