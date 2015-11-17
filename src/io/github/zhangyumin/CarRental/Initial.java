package io.github.zhangyumin.CarRental;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-11-17.
 */
public class Initial {
    public static void main(String[] args){
        int Sum = 0;
        int SumBurdenPeople = 0;
        int SumBurdenGood = 0;
        String burdenPeople ="";
        String burdenGood ="";
        System.out.println("欢迎使用答答租车系统:");
        System.out.println("您是否要租车: 1.是 2.否");
        Scanner scan = new Scanner(System.in);
        if(scan.nextInt()==1) {
            System.out.println("您可租的类型及其价目表:");
            System.out.println("序号 汽车名称 租金 容量");
            new Car(1, "奥迪A4", 500, 0, 4);
            new Car(2, "马自达6", 400, 0, 4);
            new Car(3, "皮卡雪6", 450, 2, 4);
            new Car(4, "金龙", 800, 0, 20);
            new Car(5, "松花江", 400, 4, 0);
            new Car(6, "依维柯", 1000, 20, 0);
            System.out.println("请输入您要租汽车的数量");
            Scanner number = new Scanner(System.in);
            int num = number.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("请输入第" + (i+1) + "量车的ID");
                Scanner no = new Scanner(System.in);
                switch (no.nextInt()) {
                    case 1:
                        Sum = Sum + 500;
                        burdenPeople += " 奥迪A4";
                        SumBurdenPeople += 4;
                        break;
                    case 2:
                        Sum = Sum + 400;
                        burdenPeople += " 马自达6";
                        SumBurdenPeople += 4;
                        break;
                    case 3:
                        Sum = Sum + 450;
                        burdenPeople += " 皮卡雪6";
                        burdenGood += " 皮卡雪6";
                        SumBurdenPeople += 4;
                        SumBurdenGood += 2;
                        break;
                    case 4:
                        Sum = Sum + 800;
                        burdenPeople += " 金龙";
                        SumBurdenPeople += 20;
                        break;
                    case 5:
                        Sum = Sum + 400;
                        burdenGood += " 松花江";
                        SumBurdenGood += 4;
                        break;
                    case 6:
                        Sum = Sum + 1000;
                        burdenGood += " 依维柯";
                        SumBurdenGood += 20;
                        break;
                }
            }
            System.out.println("请输入租车的天数:");
            Scanner day = new Scanner(System.in);
            Sum = Sum * day.nextInt();
            System.out.println("***可载人的车辆有");
            System.out.println(burdenPeople + "   共载人:" + SumBurdenPeople + "人");
            System.out.println("***可载货的车辆有");
            System.out.println(burdenGood+"   共载货:"+SumBurdenGood+"吨");
            System.out.println("租车总价格:"+Sum+"元");
        }
        else{

        }

    }
}
