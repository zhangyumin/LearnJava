package io.github.zhangyumin.TestPanel; /**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-19.
 */
import java.awt.*;
public class TestPanel {
    public static void main(String args[]){
        MyFrame2 mf2 = new MyFrame2(200,200,900,500,Color.blue,Color.yellow);
    }
}
class MyFrame2 extends Frame{
    private Panel p1;
    MyFrame2(int x, int y, int w, int h, Color color1,Color color2){
        setLayout(null);
        p1 = new Panel(null);
        p1.setBounds(w/4,h/4,w/2,h/2);
        p1.setBackground(color2);
        add(p1);
        setBounds(x,y,w,h);
        setBackground(color1);
        setVisible(true);
        setResizable(false);
    }
}
