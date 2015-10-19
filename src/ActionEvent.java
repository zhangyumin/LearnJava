import java.awt.*;
import java.awt.event.ActionListener;

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
public class ActionEvent {
    public static void main(String args[]){
        Frame f = new Frame("test");
        Button b = new Button("Press");
        Monitor m = new Monitor();
        b.addActionListener(m);
        f.add(b,BorderLayout.CENTER);
        f.pack();
        f.setBounds(100,100,500,300);
        f.setVisible(true);
    }
}
class Monitor implements ActionListener{
    @Override
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        System.out.println("A button has been pressed");
    }
}
