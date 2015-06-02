/**
 * Created by zym on 15-6-1.
 */
class Point {
    private int x;
    private int y;
    private int z;

    public Point(int _x, int _y, int _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public void setX(int s_x) {
        x = s_x;
    }

    public void setY(int s_y) {
        y = s_y;
    }

    public void setZ(int s_z) {
        z = s_z;
    }
    public void distance(){
        System.out.print("the distance to zero point is "+Math.sqrt(x * x + y * y + z * z));
    }
    public void display(){
        System.out.println("the point is ("+x+","+y+","+z+")");
    }

}
public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(2, 2, 2);
        point.display();
        point.setX(3);
        point.setY(4);
        point.setZ(5);
        point.display();
        point.distance();
        point.display();
    }
}
