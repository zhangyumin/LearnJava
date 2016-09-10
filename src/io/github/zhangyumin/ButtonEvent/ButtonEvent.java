package io.github.zhangyumin.ButtonEvent;

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
 * Created by zym on 15-10-19.
 */
public class ButtonEvent {
    public static void main(String args[]){
        Frame f = new Frame("io/github/zhangyumin/ButtonEvent");
        Button b1 = new Button("start");
        Button b2 = new Button("stop");
        Monitor2 m2 = new Monitor2();
        b1.addActionListener(m2);
        b2.addActionListener(m2);
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.setBounds(100,100,500,300);
//        f.pack();
        f.setVisible(true);
    }
}
class Monitor2 implements ActionListener{
    @Override
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        System.out.println("The "+actionEvent.getActionCommand()+" button is pressed");
    }
}
