package algorithm.LeftRotateString;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by workstation on 16-8-26.
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str.equals("")){
            return "";
        }
        str = Reverse(str, 0, str.length());
        str = Reverse(str, 0, str.length() - n);
        str = Reverse(str, str.length() - n, n);
        return str;
    }

    public String Reverse(String str,int start, int length){
        char[] arr = str.toCharArray();
        for(int i = start; i < start + length / 2; i++){
            char tmp = arr[i];
            arr[i] = arr[2 * start + length - i  - 1];
            arr[2 * start + length - i - 1] = tmp;
        }
        return String.copyValueOf(arr);
    }

    public static void main(String[] args) {
        String str = "abcXYZdefg";
        LeftRotateString test = new LeftRotateString();
        String newstr = test.LeftRotateString(str,3);
    }
}
