package book.core.java;

import java.util.*;


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
public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] stuff = new Employee[3];
        stuff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
        stuff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        stuff[2] = new Employee("Tony Test", 40000, 1990, 3, 15);

        for(Employee e : stuff){
            System.out.println("Id: " + e.getId() + ", Name: " +e.getName()+ ", Salary: " +e.getSalary()+ ", At " + e.getHireDate());
        }

        System.out.println("we would like to add their salary by 5%");
        for(Employee e : stuff){
            e.addSalary(5);
        }
        System.out.println("After, there salary would be:");
        for(Employee e : stuff){
            System.out.println("Id: " + e.getId() + ", Name: " +e.getName()+ ", Salary: " +e.getSalary()+ ", At " + e.getHireDate());
        }
    }
}

class Employee{
    private static int nextId = 0;
    private int id;
    private final String name;
    private double salary;
    private Date hireDate;

    public Employee(String name, double salary, int year, int month, int day){

        GregorianCalendar calendar = new GregorianCalendar(year, month, day);

        this.id = Employee.getNextId();
        this.name = name;
        this.salary = salary;
        this.hireDate = calendar.getTime();
    }
    public static int getNextId(){
        nextId ++;
        return nextId;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDate(){
        return hireDate;
    }

    public void addSalary(double rate){
        this.salary = salary*(1 + rate * 1.0 / 100);
    }
}
