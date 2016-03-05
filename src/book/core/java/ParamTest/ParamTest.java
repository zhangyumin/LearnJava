package book.core.java.ParamTest;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-5.
 */
public class ParamTest {
    public static void main(String[] args) {
        //1.Methods can't modify numeric parameters
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("before: percent = "+percent);
        tripleValue(percent);
        System.out.println("after: percent = "+percent);

        //2.Methods can change the state of object parameters
        System.out.println("Testing tripleSalary:");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("before: salary = "+harry.getSalary());
        tripleSalary(harry);
        System.out.println("after: salary = "+harry.getSalary());

        //3.Methods can't attach new objects to object parameters
        System.out.println("Testing swap");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("before: a="+a.getName());
        System.out.println("before: b="+b.getName());
        swap(a, b);
        System.out.println("after: a="+a.getName());
        System.out.println("after: b="+b.getName());
    }

    public static void tripleValue(double x){
        x = x * 3;
    }

    public static void tripleSalary(Employee e){
        e.addSalary(200);
    }

    public static void swap(Employee x, Employee y){
        Employee tmp = x;
        x = y;
        y = tmp;
        System.out.println("End of method: x=" + x.getName() + " y=" + y.getName());
    }
}

class Employee{
    private static int nextId = 0;
    private int id;
    private final String name;
    private double salary;

    public Employee(String name, double salary){

        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void addSalary(double rate){
        this.salary = salary*(1 + rate * 1.0 / 100);
    }
}