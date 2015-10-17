/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-17.
 */
public class TT implements Runnable {
    int b = 100;
    public synchronized void m1() throws Exception{
        System.out.println("in m1");
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b = "+b);
    }
    public synchronized void m2() throws  Exception{
        System.out.println("in m2");
        b = 2000;
        Thread.sleep(2500);
    }
    public void run(){
        System.out.println("in run");
        try {
            m1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]) throws Exception{
        TT tt = new TT();
        Thread t = new Thread(tt);
        t.start();
        tt.m2();
        System.out.println("tt.b = "+tt.b);
    }
}
