package book.core.java.Inheritance;

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
 * Created by zym on 16-3-6.
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000.0);
        Employee[] stuff = new Employee[3];
        stuff[0] = boss;
        stuff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        stuff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for(Employee e : stuff){
            System.out.println("name = " + e.getName() + ",salary = " + e.getSalary());
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

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
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

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
        super.setSalary(super.getSalary()+bonus);
    }

}

