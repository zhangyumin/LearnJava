package io.github.zhangyumin.LinkList;

import io.github.zhangyumin.Node.Node;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by workstation on 16-8-18.
 */
public class LinkList {
    class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public Node first;
    public LinkList(){
        first = null;
    }

    public void addFirst(Node node){
        node.next = first;
        first = node;
    }

    public Node deleteFirst(){
        Node tmp = first;
        first = first.next;
        return tmp;
    }

    public int find(int data){
        int index = -1;
        Node current = first;
        while(current != null){
            if(current.data == data){
                break;
            }
            current = current.next;
            index ++;
        }
        if(current != null){
            return index;
        }
        return -1;

    }

    public Node deleteNode(int data){
        Node current = first;
        Node prev = null;
        while(current != null){
            if(current.data == data){
                break;
            }
            prev = current;
            current = current.next;
        }
        if(current == null){
            return null;
        }else if(current == first){
            first = first.next;
        }
        else{
            prev.next = current.next;
        }
        return current;
    }

    public Node reverse(){
        Node p1,p2 = null;
        p1 = first;
        while(first.next != null){
            p2 = first.next;
            first.next = p2.next;
            p2.next = p1;
            p1 = p2;
        }
        return p2;
    }
}
