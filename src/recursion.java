/**
 * Created by zym on 15-5-31.
 */
public class recursion {
    public static void main(String arg[]){
        System.out.println(method(5));
    }
    public static int method(int n){
        if(n==1)
            return 1;
        else
            return n*method(n-1);
    }
}
