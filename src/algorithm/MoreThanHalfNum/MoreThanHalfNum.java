package algorithm.MoreThanHalfNum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < array.length; i++) {
            if(hm.containsKey(array[i])){
                hm.put(array[i], hm.get(array[i]) + 1);
            }else{
                hm.put(array[i], 1);
            }
        }
        Iterator i = hm.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry entry = (Map.Entry) i.next();
            if((int) entry.getValue() * 2 > array.length){
                return (int)entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(new MoreThanHalfNum().MoreThanHalfNum_Solution(array));
    }
}
