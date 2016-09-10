package io.github.zhangyumin.Anagram;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by workstation on 16-8-20.
 */
public class AnagramApp {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) {
        System.out.printf("Enter a word: ");
        String input = null;
        input = getString();
        size = input.length();
        count = 0;
        for (int i = 0; i < size; i++) {
            arrChar[i] = input.charAt(i);
        }
        doAnagram(size);
    }

    public static void doAnagram(int newSize){
        if(newSize == 1){
            return;
        }
        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if(newSize == 2){
                displayWord();
            }
            rotate(newSize);
        }
    }

    public static void rotate(int newSize){
        int j;
        int position = size - newSize;
        char temp = arrChar[position];
        for (j = position + 1; j < size; j++) {
            arrChar[j - 1] = arrChar[j];
        }
        arrChar[j - 1] = temp;
    }

    public static void displayWord(){
        if(count < 99){
            System.out.printf(" ");
        }
        if(count < 9){
            System.out.printf(" ");
        }
        System.out.printf(++count + " ");
        for (int j = 0; j < size; j++){
            System.out.print(arrChar[j]);
        }
        System.out.print("  ");
        System.out.flush();
        if(count % 6 == 0){
            System.out.println("");
        }
    }

//    public static String getString() throws IOException{
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String s = br.readLine();
//        return s;
//    }

    public static String getString(){
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
