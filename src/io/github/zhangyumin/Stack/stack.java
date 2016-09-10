package io.github.zhangyumin.Stack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by workstation on 16-8-16.
 */
public class stack {
    public int[] stack;
    public int maxSize;
    public int elements;
    public stack(int size){
        this.maxSize = size;
        stack = new int[maxSize];
        elements = 0;
    }

    public void push(int data){
        if(!isFull()) {
            stack[elements++] = data;
        }
    }

    public int pop(){
        if(!isEmpty()) {
            return stack[--elements];
        }else{
            return 0;
        }
    }

    public int peek(){
        return stack[elements - 1];
    }

    public boolean isEmpty(){
        return (elements == 0);
    }

    public boolean isFull(){
        return (elements == maxSize);
    }

    public void display(){
        System.out.printf(Arrays.toString(stack));
    }

    public static void main(String[] args) {
        io.github.zhangyumin.Stack.stack s = new stack(10);
        s.push(4);
        s.push(3);
        s.push(6);
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(7);
        s.push((int) (Math.random() * 10));
        s.push((int) (Math.random() * 10));
        s.push((int) (Math.random() * 10));
        s.push((int) (Math.random() * 10));
        s.push((int) (Math.random() * 10));
        s.push((int) (Math.random() * 10));
        s.push((int) (Math.random() * 10));
        s.display();
    }
}
