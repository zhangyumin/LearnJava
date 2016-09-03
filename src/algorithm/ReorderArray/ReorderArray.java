package algorithm.ReorderArray;
import java.util.*;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-9-3.
 */
public class ReorderArray {
    public void reOrderArray(int[] array) {
        ArrayList<Integer> even = new ArrayList();
        ArrayList<Integer> odd = new ArrayList();
        for(int i = 0; i < array.length; i++){
            if(isEven(array[i])){
                even.add(array[i]);
            }else{
                odd.add(array[i]);
            }
        }
        odd.addAll(even);
        for (int i = 0; i < odd.size(); i++) {
            array[i] = odd.get(i);
        }
    }

    public boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
