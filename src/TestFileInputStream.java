/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-16.
 */
import java.io.*;
public class TestFileInputStream {
    public static void main(String args[]) {
        int b = 0;
        FileInputStream in = null;
        try {
            in = new FileInputStream("/home/zym/IdeaProjects/LearningJava/src/TestFileInputStream.java");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            System.exit(-1);
        }
        try{
            long num=0;
            while((b=in.read())!=-1){
                System.out.print((char)b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("read "+num+"bytes");
        }catch (IOException e1){
            System.out.println("file read error");
            System.exit(-1);
        }
    }
}
