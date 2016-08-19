package io.github.zhangyumin.DoublyLinkList;

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
public class DoublyLinkList {
    class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public Node first;
    public Node last;
    public DoublyLinkList(){
        first = null;
        last = null;
    }

    public void insertNode(int index, Node node){
        if(index == 1){
            node.next = first;
            first = node;
        }else{
            Node current = first;
            Node prev = first;
            int i = 0;
            while(current.next != null){
                if(++i == index){
                    prev.next = node;
                    node.next = current;
                }else{
                    prev = current;
                    current = current.next;
                }

            }
            if(current.next == null){
                last.next = node;
                last = node;
            }
        }
    }


}
