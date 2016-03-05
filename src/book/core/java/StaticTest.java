package book.core.java;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-5.
 */
public class StaticTest {
    private static int a = 2;
    static {
        System.out.println(a);
        int a = 3;
        System.out.println(a);
    }
    public StaticTest() {
        System.out.println(a);
        int a = 4;
        System.out.println(a);
    }
    public int getA(){
        return a;
    }
    static{
        System.out.println(a);
        int a = 5;
        System.out.println(a);
    }
    public static void main(String[] args) {
        StaticTest t = new StaticTest();
        System.out.println(t.getA());
    }
}
