/**
 * Created by zym on 15-5-31.
 */
public class ConstructionMethod {
    static class Student{
        static int id;
        static String name;
        void introduction(){
            System.out.println("My name is "+Student.name+" My id number is "+Student.id);
        }
        Student(int _id,String _name) {
            id = _id;
            name = _name;
        }
    }
    public static void main(String[] args){
        Student tom = new Student(2322,"Tom");
        tom.introduction();
    }
}
