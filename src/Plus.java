import sun.font.TextLabel;

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
 * Created by zym on 15-10-20.
 */
public class Plus {
    public static void main(String args[]){
        new window().lunchFrame();
    }
}
class window extends Frame{
    TextField tf1,tf2,tf3;
    public void lunchFrame(){
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(15);
        Label lb = new Label("+");
        Button eq = new Button("=");
        eq.addActionListener(new Monitor4(this));
        add(tf1);
        add(lb);
        add(tf2);
        add(eq);
        add(tf3);
        pack();
        setLayout(new FlowLayout());
        setVisible(true);
    }

}
class Monitor4 implements ActionListener{
    window win = null;
    public Monitor4(window win){
        this.win = win;
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        int n1 = Integer.parseInt(win.tf1.getText());
        int n2 = Integer.parseInt(win.tf2.getText());
        win.tf3.setText(""+(n1+n2));
    }
}
