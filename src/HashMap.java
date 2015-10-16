/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-16.
 */
import java.util.*;
public class HashMap {
    public static void main(String args[]){
        Map m1 = new java.util.HashMap();
        Map m2 = new java.util.HashMap();
        m1.put("one",1);
        //m1.put("one",new Integer(1));
        m1.put("two",new Integer(2));
        m1.put("three",new Integer(3));
        m2.put("A",new Integer(1));
        m2.put("B",new Integer(2));
        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(new Integer(1)));
        if(m1.containsKey("two")){
            //不能忽略Integer 因为系统不知道m1.get("two")是否能转换成int,而强制转换成Integer则一定可以
            int i = (Integer)m1.get("two");
            System.out.println(i);
        }
        Map m3 = new java.util.HashMap(m1);
        m3.putAll(m2);
        System.out.println(m3);
    }
}
