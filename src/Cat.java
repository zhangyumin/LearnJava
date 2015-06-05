/**
 * Created by zym on 15-6-5.
 */
public class Cat {
    private static int sid = 0;
    private String name;
    int id;
    Cat(String name){
        id = sid++;
    }
    public void info(){
        System.out.println("My name is "+name+"No."+id);
    }
    public static void main(String args[]){
        Cat.sid = 100;
        Cat mimi = new Cat("mimi");
        Cat pipi = new Cat("pipi");
        mimi.info();
        pipi.info();
    }
}
