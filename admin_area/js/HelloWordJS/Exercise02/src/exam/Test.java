/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test extends Rectangle{

    private int maxRec;
    private int nextRec;
    private Rectangle[] rec;
    
    public Test(){
    maxRec =100;
    nextRec =0;
    rec = new Rectangle[maxRec];
    }
    
    public void add() {
        Rectangle rt = new Rectangle();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Width: ");
        rt.setWidth(input.nextDouble());
        System.out.print("Input Length: ");
        rt.setLength(input.nextDouble());
        rec[nextRec++] = rt;
    }
    
    public void SeachSquare(double Width){
    boolean found = false;
        for (int i = 0; i < nextRec; i++) {
            if ((rec[i].getWidth() == (double) Length) && (rec[i].getLength() == (double) Width)) {
                rec[i].displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found!");
        }
    }
    
    public void  displayall(){
        if (nextRec == 0) {
            System.out.println("empty list");
        } 
        else {
            for (int i = 0; i < nextRec; i++) {
                System.out.println("the information of Student: "+(i+1)+":");
                System.out.println("<==========================================>");
                rec[i].displayInfo();
            }
        }
    }
    
    public int  menu(){
    Scanner input = new Scanner(System.in);
        System.out.println("\n1. Add Rectangle\n2. Find Square"
                +"\n3.Display All\n4. Exit");
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
                    double Width = input.nextDouble();
                    tt.SeachSquare(Width);
                    break;
                case 3:
                    tt.displayall();
                    break;
            }
        } while (option != 4);
    }
    
}
