package io.github.zhangyumin.HanoiTower;

import java.util.Iterator;
import java.util.Stack;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-4-21.
 */
public class Hanoi{
    static int j = 1;

    //塔
    class Tower<E> {
        //塔编号
        private int number;
        //塔名称
        private String name;
        //存放盘子的栈
        private Stack<E> stack = new Stack<E>();

        public Tower(int number,String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public Stack<E> getStack() {
            return stack;
        }

    }

    //盘子
    class Tray {
        //盘子编号
        private int number;
        //盘子名称
        private String name;

        public Tray(int number,String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return name;
        }
    }

    public <T> void hanoi(int num,Tower<T> from,Tower<T> middle,
                          Tower<T> to) {
        if(num == 1) {
            move(from,middle,to);
        } else {
            //将num-1个盘子从from塔上移到middle塔上
            hanoi(num-1,from,to,middle);
            //将第num个盘子移到to塔上
            move(from,middle,to);
            //将num-1个盘子从middle塔上移到to塔上
            hanoi(num-1,middle,from,to);
        }
    }

    private <E> void move(Tower<E> from,Tower<E> middle ,Tower<E> to) {
        E tray = from.getStack().pop();
        to.getStack().push(tray);
        StringBuilder sb = new StringBuilder();
        sb.append("=====================Hanoi.move()=======" + j++ + "===============\n")
                .append(" Move tray : ").append(((Tray)tray).getName())
                .append(" from ").append(from.getName()).append(" to ")
                .append(to.getName()).append("\n ")
                .append(from.getName()).append(":").append(format(from)).append(",")
                .append(middle.getName()).append(":").append(format(middle)).append(",")
                .append(to.getName()).append(":").append(format(to));
        System.out.println(sb.toString());
    }

    private <E> String format(Tower<E> tower) {
        Iterator<E> i = tower.getStack().iterator();
        if (! i.hasNext())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        while(i.hasNext()) {
            sb.append(i.next().toString()).append(",");
        }
        sb.replace(sb.length()-1, sb.length(), "]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        Tower<Tray> from = hanoi.new Tower<Tray>(1, "1号塔");
        Tower<Tray> middle = hanoi.new Tower<Tray>(2, "2号塔");
        Tower<Tray> to = hanoi.new Tower<Tray>(3, "3号塔");
        int num = 6;
        for (int i = num; i >0; i--) {
            Tray tray = hanoi.new Tray(i,i+"号盘子");
            from.getStack().push(tray);
        }
        hanoi.hanoi(num, from, middle, to);
    }
}
