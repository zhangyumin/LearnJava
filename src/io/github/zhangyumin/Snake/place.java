package io.github.zhangyumin.Snake;

import java.awt.*;
import java.awt.event.*;

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
public class place extends Frame {
    static final int ROWS = 50;
    static final int COLS = 50;
    static final int BLOCK_SIZE = 15;

    snake s = new snake();
    food f = new food();
    Image OffScreenImage = null;

    public void lunch(){
        this.setLocation(200,200);
        this.setSize(COLS*BLOCK_SIZE,ROWS*BLOCK_SIZE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
        this.addKeyListener(new KeyMonitor());
        new Thread(new paintThread()).start();
    }

    public static void main(String args[]){
        new place().lunch();

    }

    @Override
    public void paint(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.GRAY);
        g.fillRect(0,0,COLS*BLOCK_SIZE,ROWS*BLOCK_SIZE);
        g.setColor(Color.DARK_GRAY);
        //画横线
        for(int i=1; i<ROWS; i++){
            g.drawLine(0, i*BLOCK_SIZE, COLS*BLOCK_SIZE, i*BLOCK_SIZE);
        }
        //画竖线
        for(int i=1; i<COLS; i++){
            g.drawLine(i*BLOCK_SIZE, 0, i*BLOCK_SIZE, ROWS*BLOCK_SIZE);
        }
        g.setColor(c);
        s.draw(g);
        f.draw(g);
        s.eat(f);
    }
    private class paintThread implements Runnable{
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void update(Graphics g){
        if(OffScreenImage == null) {
            this.OffScreenImage = this.createImage(BLOCK_SIZE*COLS, BLOCK_SIZE*ROWS);
        }
        Graphics gOff = OffScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(OffScreenImage, 0, 0, null);
    }
    private class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            s.keyPressed(e);
        }
    }
}
