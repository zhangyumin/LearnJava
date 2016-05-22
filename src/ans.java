import java.util.*;
import java.io.*;
public class ans{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if(n == 0){
            System.out.println(0);
        }
        else{
            ArrayList s = new ArrayList();
            for (int i = 0; i < n; i++) {
                s.add(in.nextInt());
            }
            for (int i = 0; i+2 < s.size(); i++) {
                System.out.println(s.get(i));
            }
        }
    }
}