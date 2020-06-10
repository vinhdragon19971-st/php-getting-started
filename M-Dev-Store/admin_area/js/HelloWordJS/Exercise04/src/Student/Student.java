/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Person.Person;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Student extends Person{
    protected double avg_mark;

    @Override
    public void displayInfo() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Year of Birth : " + yob);
    }

    public Student(double avg_mark) {
        this.avg_mark = avg_mark;
    }
    
    public Student(){
        avg_mark = 0.0d;
    }

    public double getAvg_mark() {
        return avg_mark;
    }

    public void setAvg_mark(double avg_mark) {
        this.avg_mark = avg_mark;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Input ID  : ");
            id = input.nextLine();
            System.out.print("Input Name : ");
            name = input.nextLine();
            System.out.print("Input Year Of Birth : ");
            yob = input.nextInt();
            System.out.print("Input AVG Mark : ");
            avg_mark = input.nextDouble();
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
}
