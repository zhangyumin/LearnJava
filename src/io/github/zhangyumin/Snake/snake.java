package io.github.zhangyumin.Snake;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-22.
 */
public class snake {
    private int size = 0;
    private Node head = null;
    private Node tail = null;
    private Node n = new Node(25,25,dir.L);

    public snake(){
        tail = n;
        head = n;
        size = 1;
    }
    public void addToTail(){
        Node node = null;
        switch (tail.direction){
            case L:
                node = new Node(tail.row, tail.col+1, tail.direction);
                break;
            case R:
                node = new Node(tail.row, tail.col-1, tail.direction);
                break;
            case U:
                node = new Node(tail.row+1, tail.col, tail.direction);
                break;
            case D:
                node = new Node(tail.row-1, tail.col, tail.direction);
                break;
        }
        tail.next = node;
        node.pre = tail;
        tail = node;
        size ++;
    }
    public void addToHead(){
        Node node = null;
        switch (head.direction){
            case L:
                node = new Node(head.row, head.col-1, head.direction);
                break;
            case R:
                node = new Node(head.row, head.col+1, head.direction);
                break;
            case U:
                node = new Node(head.row-1, head.col, head.direction);
                break;
            case D:
                node = new Node(head.row+1, head.col, head.direction);
                break;
        }
        node.next = head;
        head.pre = node;
        head = node;
        size ++;
    }
    public void deleteFromTail(){
        if(size == 0){
            return;
        }
        tail = tail.pre;
        tail.next = null;

    }
    void draw(Graphics g){
        if(size <= 0){
            return;
        }
        for(Node n = tail; n!=null; n=n.next){
            n.draw(g);
        }
        move();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_LEFT:
                head.direction = dir.L;
                break;
            case KeyEvent.VK_RIGHT:
                head.direction = dir.R;
                break;
            case KeyEvent.VK_UP:
                head.direction = dir.U;
                break;
            case KeyEvent.VK_DOWN:
                head.direction = dir.D;
                break;
        }
    }
    public void eat(food f){
        if(this.getRect().intersects(f.getRect())){
            f.reAppear();
        }
    }
    private Rectangle getRect(){
        return new Rectangle(head.col*place.BLOCK_SIZE, head.row*place.BLOCK_SIZE, head.w, head.h);
    }
    public void move(){
        addToHead();
        deleteFromTail();
    }

    private class Node{
        int w = place.BLOCK_SIZE;
        int h = place.BLOCK_SIZE;
        int row, col;
        dir direction = dir.L;
        Node next = null;
        Node pre = null;

        public Node(int row,int col,dir dir){
            this.col = col;
            this.row = row;
            this.direction = dir;
        }
        void draw(Graphics g){
            Color c = g.getColor();
            g.setColor(Color.BLACK);
            g.fillRect(col*place.BLOCK_SIZE, row*place.BLOCK_SIZE, w,h);
            g.setColor(c);
        }
    }
}
