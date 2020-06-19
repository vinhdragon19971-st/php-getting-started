/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

import emp.Employee;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Worker implements Employee{
    protected String name;
    protected double salary;
    protected double workday;
    
    public Worker(String name, double salary, double workday) {
        this.name = name;
        this.salary = salary;
        this.workday = workday;
    }

    public Worker() {
        name = "";
        salary = 0.0d;
        workday = 0.0d;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Input name  : ");
            name = input.nextLine();
            System.out.println("Input salary : ");
            salary = input.nextDouble();
            do{
                System.out.println("Input workday : ");
                workday = input.nextDouble();
            }while(workday < 0 || workday > 31);
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
    }

    public String getName(String nextLine) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(double nextDouble) {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkday(double nextDouble) {
        return workday;
    }

    public void setWorkday(double workday) {
        this.workday = workday;
    }
        

    @Override
    public void calculateSalary() {
        System.out.println("Salary = " + ((workday*BASIC)/22));
    }

    @Override
    public void display() {       
        System.out.println("Name worker    : " + name);
        System.out.println("Workday worker : " + workday);
        calculateSalary() ;
    }    
    
}
