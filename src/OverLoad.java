/**
 * Created by zym on 15-6-1.
 */
class Person{
    Person(){
        id = 100;
        age = 24;
    }
    Person(int _id){
        id = _id;
        age = 30;
    }
    Person(int _id,int _age){
        id = _id;
        age = _age;
    }
    public int id;
    public int age = 20;

    public int getAge(){
        return age;
    }
    public void setAge(int i){
        age = i;
    }
    public int getId(){
        return id;
    }

    void info(){
        System.out.println("my id is : "+id);
    }
    void info(String t){
        System.out.println(t+" id "+id);
    }
}
public class OverLoad {
    public static void main(String[] args){
        Person p = new Person();
        Person p1 = new Person(400);
        p.info();
        p.info("OK");
    }
}
