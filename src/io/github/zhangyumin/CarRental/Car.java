package io.github.zhangyumin.CarRental;

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
public class Car {
    int id;
    String name;
    int price;
    int burdenPeople;
    int burdenGood;
    Car(int id,String name,int price,int burdenGood,int burdenPeople){
        this.id = id;
        this.name = name;
        this.price = price;
        this.burdenPeople = burdenPeople;
        this.burdenGood = burdenGood;
        print();
    }

    void print(){
        if(burdenGood>0 && burdenPeople> 0)
            System.out.println(id+" "+name+" "+price+"元/天"+" "+"载人:"+burdenPeople+"人 "+"载货:"+burdenGood+"吨");
        else if(burdenGood>0 && burdenPeople<=0)
            System.out.println(id+" "+name+" "+price+"元/天"+" "+"载货:"+burdenGood+"吨");
        else if(burdenGood<=0 && burdenPeople>0)
            System.out.println(id+" "+name+" "+price+"元/天"+" "+"载人:"+burdenPeople+"人");
    }
}