package io.github.zhangyumin.Sort;

import java.util.*;

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
public class TestSort {
    public static String RandomString(int length){
        String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < length ; i++){
            int pointer = random.nextInt(base.length());
            sb.append(base.charAt(pointer));
        }
        return sb.toString();
    }
    public void Sort(){
        List<String> alphabet= new ArrayList<String>();
        for(int i = 0;i < 10; i++){
            Random rdm = new Random();
            String newString = RandomString(rdm.nextInt(10));
            if(!alphabet.contains(newString)){
                alphabet.add(newString);
                System.out.println("将要添加字符串:'" + newString + "'");
            }
        }
        System.out.println("---------排序前----------");
        Collections.sort(alphabet);
        for(String string : alphabet){
            System.out.println(string);
        }
        System.out.println("---------排序后----------");

    }
    public static void main(String args[]){
        TestSort ts = new TestSort();
        ts.Sort();
    }
}
