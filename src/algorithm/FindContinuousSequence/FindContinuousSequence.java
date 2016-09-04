package algorithm.FindContinuousSequence;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-9-4.
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int res = 0;
        LinkedList<Integer> ll = new LinkedList();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= sum / 2 + 1; i++) {
            if(res <= sum){
                ll.add(i);
                res = res + i;
            }
            while(res > sum){
                int tmp = ll.pollFirst();
                res = res - tmp;
            }
            if(res == sum){
                result.add(new ArrayList<>(ll));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindContinuousSequence s = new FindContinuousSequence();
        System.out.println(s.FindContinuousSequence(9));
    }
}
