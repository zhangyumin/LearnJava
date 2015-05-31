/**
 * Created by zym on 15-5-31.
 */
public class ConstructionMethod {
    static class student{
        static int id;
        static String name;
        void introduction(){
            System.out.println("My name is "+student.name+" My id number is "+student.id);
        }
        student(int _id,String _name) {
            id = _id;
            name = _name;
        }
    }
    public static void main(String[] args){
        student tom = new student(232,"Tom");
        tom.introduction();
    }
}
