package io.github.zhangyumin.DoubleLinkList;

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
public class DoubleLinkList {
    class Node{
        public int data;
        public Node next;
        public Node last;
        public Node(int data){
            this.data = data;
        }
        public void display(){
            System.out.printf(data + " -> ");
        }
    }

    public Node first;
    public DoubleLinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void addNode(int index, int data){
        Node node = new Node(data);
        int i = 0;
        Node current = first;
        Node prev = null;
        if(isEmpty()){
            first = node;
        }
        else if(index == 1){
            first.last = node;
            node.next = first;
            first = node;
        }else {
            while (current != null) {
                if (++i == index) {
                    node.next = current;
                    current.last = node;
                    break;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
            prev.next = node;
            node.last = prev;
        }
    }

    public void display(){
        Node current = first;
        while(current != null) {
            current.display();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkList dll = new DoubleLinkList();
        dll.addNode(1,3);
        dll.addNode(1,5);
        dll.addNode(2,4);
        dll.addNode(3,1);
        dll.display();
    }
}
