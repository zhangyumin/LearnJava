package io.github.zhangyumin.Game1;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-7-23.
 */
class Game{
    int flag = 0;
    int num = 500;
    int people[] = new int[num];
    Game(int a){
        num = a;
        for(int i = 0;i < num;i++){
            people[i] = i+1;
        }
    }
    public void play(){
        int sum = 0;
        int j = 0;
        while(sum != 1) {
            for (j = 0; j < num; j++) {
                if (people[j] != 0) {
                    flag++;
                    sum++;
                }
                if (flag == 3) {
                    flag = 0;
                    people[j] = 0;
                }
            }
            if(sum == 1) {
                for (int k = 0;k < num;k++) {
                    if (people[k] != 0)
                        System.out.println(people[k]);
                }
                break;
            }
            else
                sum = 0;
        }
        //System.out.println(people[j]);
    }
}
public class TestGame {
    public static void main(String args[]) {
        Game game = new Game(500);
        game.play();
    }
}
