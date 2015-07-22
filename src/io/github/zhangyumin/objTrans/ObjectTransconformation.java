package io.github.zhangyumin.objTrans;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-7-22.
 */
class Animal{
    public String name;
    Animal(String name){
        this.name = name;
    }
}
class Cat extends Animal{
    public String eyesColor;
    Cat(String n,String c){
        super(n);
        eyesColor = c;
    }
}
class Dog extends Animal{
    public String furColor;
    Dog(String n,String c){
        super(n);
        furColor = c;
    }
}
public class ObjectTransconformation {
    public static void main(String[] args){
        Animal a = new Animal("name");
        Cat c = new Cat("Tom","blue");
        Dog d = new Dog("Bob","black");

        System.out.println(a instanceof Animal);
        System.out.println(c instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(a instanceof Cat);

        a = new Dog("Todd","white");
        System.out.println(a.name);
        //System.out.println(a.furColor);Dog被看做是Animal类,只包含父类所用有的属性和方法
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        Dog d1 = (Dog) a;
        System.out.println(d1.furColor);
    }
}
