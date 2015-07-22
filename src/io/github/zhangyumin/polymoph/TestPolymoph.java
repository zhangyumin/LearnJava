package io.github.zhangyumin.polymoph;

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
    private String name;
    Animal(String name){
        this.name = name;
    }
    public void enjoy(){
        System.out.println("ahu");
    }
}
class Cat extends Animal{
    private String eyesColor;
    Cat(String n,String c){
        super(n);
        eyesColor = c;
    }
    public void enjoy(){
        System.out.println("miaomiao");
    }
}
class Dog extends Animal{
    private String furColor;
    Dog(String n,String c){
        super(n);
        furColor = c;
    }
    public void enjoy(){
        System.out.println("wangwang");
    }
}
class Bird extends Animal{
    private String featherColor;
    Bird(String n,String f){
        super(n);
        featherColor = f;
    }
    public void enjoy(){
        System.out.println("zhizhizhi");
    }
}

class Lady{
    private String name;
    private Animal pet;
    Lady(String name,Animal pet){
        this.name = name;
        this.pet = pet;
    }
    public void myPetEnjoy(){
        pet.enjoy();
    }
}
public class TestPolymoph {
    public static void main(String args[]){
        Cat c = new Cat("catname","black");
        Dog d = new Dog("dogname","white");
        Bird b = new Bird("birdname","yellow");
        Lady l1 = new Lady("11",c);
        Lady l2 = new Lady("12",d);
        Lady l3 = new Lady("13",b);
        l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}
