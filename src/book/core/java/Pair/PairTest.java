package book.core.java.Pair;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-9.
 */
public class PairTest {
    public static void main(String[] args) {
        String[] words ={"Mary", "had", "a", "little", "lamb"};
        ArrayAlg.Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("Min=" + mm.getFirst());
        System.out.println("Max=" + mm.getSecond());
    }

}
class ArrayAlg{
    public static class Pair<S> {
        private String first;
        private String second;

        public Pair(String f, String s){
            first = f;
            second = s;
        }

        public String getFirst() {
            return first;
        }

        public String getSecond() {
            return second;
        }
    }

    public static Pair<String> minmax(String[] a){
        if(a == null || a.length == 0){
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(min.compareTo(a[i]) > 0)
                min = a[i];
            if(max.compareTo(a[i]) < 0)
                max= a[i];
        }
        return new Pair<>(min, max);
    }
}