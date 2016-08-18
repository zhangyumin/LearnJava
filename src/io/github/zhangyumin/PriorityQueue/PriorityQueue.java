package io.github.zhangyumin.PriorityQueue;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by workstation on 16-8-17.
 */
public class PriorityQueue {
    public int[] priorityqueue;
    public int maxSize;
    public int elements;

    public PriorityQueue(int size){
        maxSize = size;
        priorityqueue = new int[maxSize];
        elements = 0;
    }

    public boolean isEmpty(){
        return elements == 0;
    }

    public boolean isFull(){
        return elements == maxSize;
    }

    public void insert(int data){
        int i = 0;
        if(!isFull()) {
            if (isEmpty()) {
                priorityqueue[0] = data;
            } else {
                for (i = 0; i < maxSize - 1; i++) {
                    if (data > priorityqueue[i]) {
                        priorityqueue[i + 1] = priorityqueue[i];
                    }
                }
                    priorityqueue[i] = data;
            }
            elements ++;
        }
    }

    public int remove(){
        if(!isEmpty()){
            return priorityqueue[--elements];
        }
        return -1;
    }

    public int peekfront(){
        return priorityqueue[elements - 1];
    }
}
