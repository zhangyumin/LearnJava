package io.github.zhangyumin.Queue;

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
public class Queue {
    public int[] queue;
    public int elements;
    public int maxSize;
    public int front;
    public int tail;

    public Queue(int size){
        maxSize = size;
        queue = new int[maxSize];
        elements = 0;
        front = 0;
        tail = 0;
    }

    public void push(int num){
        if(++tail >= maxSize){
            tail = 0;
        }
        queue[tail] = num;
        elements ++;
    }

    public int pop(int num){
        if(++front >= maxSize){
            front = 0;
        }
        elements --;
        return queue[front - 1];
    }

    public int peek(){
        return queue[tail];
    }

    boolean isFull(){
        return (elements == maxSize);
    }

    boolean isEmpty(){
        return elements == 0;
    }


}
