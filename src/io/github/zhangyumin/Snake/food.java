package io.github.zhangyumin.Snake;

import java.awt.*;
import java.util.Random;

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
public class food {
    int row, col;
    int w = place.BLOCK_SIZE;
    int h = place.BLOCK_SIZE;
    private static Random r = new Random();

    public food(int row,int col){
        this.col = col;
        this.row = row;
    }

    public food(){
        this(r.nextInt(place.ROWS),r.nextInt(place.COLS));
    }

    public void reAppear(){
        this.row = r.nextInt(place.ROWS);
        this.col = r.nextInt(place.COLS);
    }

    public Rectangle getRect(){
        return new Rectangle(this.col*place.BLOCK_SIZE, this.row*place.BLOCK_SIZE, this.w, this.h);
    }

    public void draw(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.GREEN);
        g.fillRect(col*place.BLOCK_SIZE, row*place.BLOCK_SIZE, w,h);
        g.setColor(c);
    }
}
