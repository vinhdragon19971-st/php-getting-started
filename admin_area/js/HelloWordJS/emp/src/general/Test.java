/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import emp.Employee;
import java.util.Scanner;
import salary.Worker;

/**
 *
 * @author User
 */
public class Test extends Worker implements Employee{

    private int maxW;
    private int nextW;
    private Worker[] Wor;
    
    public Test(){
    maxW =100;
    nextW =0;
    Wor = new Worker[maxW];
    }
    
    public void add() {
        Scanner input = new Scanner(System.in);
        if(nextW == maxW)
            System.out.println("\nFull array!");
        else{
            Worker worker = new Worker();
            worker.input();
            Wor[nextW++] = worker;
        }
    }
    
    public void Overime(double salary){
    boolean found = false;
        for (int i = 0; i < nextW; i++) {
            if ((Wor[i].getSalary(salary) > 22)) {
                Wor[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Does not have over time");
        }
    }
    
    public void  displayall(){
        if (nextW == 0) {
            System.out.println("empty list");
        } 
        else {
            for (int i = 0; i < nextW; i++) {
                System.out.println("the information of Worker: "+(i+1)+":");
                System.out.println("<==========================================>");
                Wor[i].display();
            }
        }
    }
    
    public int  menu(){
    Scanner input = new Scanner(System.in);
        System.out.println("\n1. Add Worker\n2. Find Overtime"
                +"\n3. Display All\n4. Exit");
        System.out.print("please enter your option : ");
        int option = input.nextInt();
        return option;
    }
    
    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        Test tt = new Test();
        do{
            option = tt.menu();
            switch(option){
                case 1:
                    tt.add();
                    break;
                case 2:
                    System.out.print("Input student name: ");
                    double salary = input.nextDouble();
                    tt.Overime(salary);
                    break;
                case 3:
                    tt.displayall();
                    break;
            }
        } while (option != 4);
    }
    
}
