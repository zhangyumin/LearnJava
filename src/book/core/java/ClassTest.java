package book.core.java;

import java.io.PrintWriter;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-6.
 */
public class ClassTest {
    public static void main(String[] args) {
        FatherClass f = new FatherClass();
        f.getName();
        FatherClass s = new SonClass();
        s.getName();
        SonClass d = new SonClass();
        d.getName();
    }
}

class FatherClass{
    private String name = "father";
    public void getName(){
        System.out.println(name);
    }
}

class SonClass extends FatherClass{
    private String name = "son";

    @Override
    public void getName() {
        System.out.println("haha");
    }
}
