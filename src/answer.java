import java.io.*;
import java.util.*;

public class answer{
    public static int f1(int a, int n){
        int total = 0;
        double up = 1;
        double bot = 1;
        int l = (int)Math.pow(2, a);
        for (int i = 0; i < a; i++) {
            total = (int)(total + Math.pow(2, i));
        }
        int h = n - total;
        int sum = h;
        for (int i = 0; i < sum; i++) {
            up = up * (l --);
            bot = bot * (h --);
        }
        int ans = (int)(up / bot);
        return ans;
    }
    public static int f2(int a, int n){
        int total = 0;
        double up = 1;
        double bot = 1;
        int l = (int)Math.pow(2, a);
        for (int i = 0; i < a; i++) {
            total = (int)(total + Math.pow(2, i));
        }
        int h = n - total;
        int sum = h;
        for (int i = 0; i < sum; i++) {
            up = up * (l --);
            bot = bot * (h --);
        }
        int ans = (int)(up / bot);
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = 0;
        double num = 0;
        for(int i = 1; num < n; i++){
            pos ++;
            num = num + Math.pow(2, i);
        }
//        System.out.println(pos);
        System.out.println(f1(pos, n)+f2(pos, n));
    }
}