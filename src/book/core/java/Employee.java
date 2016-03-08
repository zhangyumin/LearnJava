package book.core.java;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>{
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

    public Employee(String name, double salary){

        this.name = name;
        this.salary = salary;
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

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
