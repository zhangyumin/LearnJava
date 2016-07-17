package io.github.zhangyumin.Node;

public class LinkList{
    public Node first;
    private int pos = 0;

    public LinkList(){
        this.first = null;
    }

    public void addFirstNode(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

    public Node deleteFirstNode(){
        Node tmpNode = first;
        first = tmpNode.next;
        return tmpNode;
    }

    public void insertNewNode(int data,int index){
        Node node = new Node(data);
        Node current = first;
        Node previous = first;
        while(index != pos){
            previous = current;
            current = current.next;
            pos ++;
        }
        previous.next = node;
        node.next = current;
        pos = 0;
    }

    public void deleteOneNode(int index){
        Node current = first;
        Node previous = first;
        while(index != pos){
            previous = current;
            current = current.next;
            pos ++;
        }
        if(current == first){
            first = first.next;
        }
        else {
            previous.next = current.next;
            pos = 0;
        }
    }
}
