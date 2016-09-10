package algorithm.FindGreatestSumOfSubArray;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-9-2.
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0){
            return 0;
        }
        int max = 0;
        int max_num = array[0];
        int tmp = 0;
        for(int i = 0; i < array.length; i++){
            max_num = max_num > array[i] ? max_num : array[i];
            tmp = tmp + array[i];
            if(tmp < 0){
                tmp = 0;
            }
            else if(tmp > max){
                max = tmp;
            }
        }
        if(max == 0){
            max = max_num;
        }
        return max;
    }

    public static void main(String[] args) {
        FindGreatestSumOfSubArray t = new FindGreatestSumOfSubArray();
        int[] array = {-2,-8,-1,-5,-9};
        System.out.println(t.FindGreatestSumOfSubArray(array));
    }
}
