package algorithm.LineSegmentIntersection;

import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by joker on 16-5-27.
 *
 * 给出平面上两条线段的两个端点，判断这两条线段是否相交（有一个公共点或有部分重合认为相交）。 如果相交，输出"Yes"，否则输出"No"。
 * Input
 * 第1行：一个数T，表示输入的测试数量(1 <= T <= 1000)
 * 第2 - T + 1行：每行8个数，x1,y1,x2,y2,x3,y3,x4,y4。(-10^8 <= xi, yi <= 10^8)
 * (直线1的两个端点为x1,y1 | x2, y2,直线2的两个端点为x3,y3 | x4, y4)
 * Output
 * 输出共T行，如果相交输出"Yes"，否则输出"No"。
 */
public class LineSegmentIntersection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double x1 = in.nextInt();
            double y1 = in.nextInt();
            double x2 = in.nextInt();
            double y2 = in.nextInt();
            double x3 = in.nextInt();
            double y3 = in.nextInt();
            double x4 = in.nextInt();
            double y4 = in.nextInt();
            double k1 = (y2 - y1) / (x2 - x1);
            double k2 = (y4 - y3) / (x4 - x3);
            double max1 = ((x1 > x2) ? x1 : x2);
            double min1 = ((x1 > x2) ? x2 : x1);
            double max2 = ((x3 > x4) ? x3 : x4);
            double min2 = ((x3 > x4) ? x4 : x3);
            if(Math.abs(k1 - k2) == 0) {
                if((x3 >= min1 && x3 <= max1) || (x4 >= min1 && x4 <= max1)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }else{
                double b1 = y1 - k1 * x1;
                double b2 = y3 - k2 * x3;
                double ix = (b2 - b1) / (k1 - k2);
                if(ix >= min1 && ix <= max1 && ix >= min2 && ix <= max2)
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }
        }
    }
}
