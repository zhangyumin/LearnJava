package algorithm.VerifySequenceOfBST;

import java.util.Arrays;

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
public class VerifySequenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        if(sequence.length == 1){
            return true;
        }
        int root = sequence[sequence.length - 1];
        int pos = 0;
        for (pos = 0; pos < sequence.length - 1; pos++) {
            if(sequence[pos] >= root){
                break;
            }
        }
        for (int i = pos; i < sequence.length - 1; i++) {
            if(sequence[i] < root){
                return false;
            }
        }
        int[] sub1 = Arrays.copyOfRange(sequence, 0, pos);
        int[] sub2 = Arrays.copyOfRange(sequence, pos, sequence.length - 1);

        if(sub1.length > 0 && sub2.length > 0){
            return VerifySquenceOfBST(sub1) && VerifySquenceOfBST(sub2);
        }else if(sub1.length > 0){
            return VerifySquenceOfBST(sub1);
        }else if (sub2.length > 0){
            return VerifySquenceOfBST(sub2);
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        int[] sequence = {};
        System.out.println(new VerifySequenceOfBST().VerifySquenceOfBST(sequence));
    }
}
