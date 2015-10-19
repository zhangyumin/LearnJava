import java.awt.*;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-19.
 */
public class TestLayOut {
    public static void main(String args[]){
        MyFrame3 mf3 = new MyFrame3(100,200,300,400);
    }
}
class MyFrame3 extends Frame{
    MyFrame3(int x,int y,int w,int h){
        Panel p = new Panel(null);
        p.setLayout(new BorderLayout());
        Button b1 = new Button("Button");
        Button b2 = new Button("Button");
        Button b3 = new Button("Button");
        Button b4 = new Button("Button");
        p.add(b1,BorderLayout.WEST);
        p.add(b2,BorderLayout.NORTH);
        p.add(b3,BorderLayout.EAST);
        p.add(b4,BorderLayout.SOUTH);
        add(p);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
