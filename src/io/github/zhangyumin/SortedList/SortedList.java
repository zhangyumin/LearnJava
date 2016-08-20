package io.github.zhangyumin.SortedList;

import algorithm.Sort.Sort;
import io.github.zhangyumin.Node.Node;

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
public class SortedList {
    class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node first;
    public SortedList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertNode(Node node){
        Node current = first;
        Node prev = first;
        if(isEmpty()){
            first = node;
        }
        while(current.next != null){
            if(current.data < node.data){
                prev = current;
                current = current.next;
            }else{
                node.next = current;
                prev.next = node;
            }
        }
        if(current.next == null){
            current.next = node;
        }
    }
}
