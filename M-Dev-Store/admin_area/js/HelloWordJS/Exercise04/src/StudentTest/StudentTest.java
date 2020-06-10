/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentTest;

import Student.Student;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author User
 */
public class StudentTest extends Student{

    private List<Student> list = new Vector<>();
    
    public int  menu(){
    Scanner input = new Scanner(System.in);
        System.out.println("\n1. Add student\n2. Display all"
                +"\n3. Search by id\n4. Delete student by id");
        System.out.print("please enter your option : ");
        int option = input.nextInt();
        return option;
    }
    
    public void add() {
        Scanner input = new Scanner(System.in);
        Student s = new Student();
        try{
            System.out.print("Input id: ");
            s.setId(input.nextLine());
            System.out.print("Input name: ");
            s.setName(input.nextLine());
            System.out.print("Input yob: ");
            s.setYob(input.nextInt());
            System.out.print("Input avg mark: ");
            s.setAvg_mark(input.nextDouble());
            list.add(s);
        }catch(Exception ex){
            System.out.print("Error: " + ex.getMessage());
        }
    }
    
    public void  displayall(){
        if(list.isEmpty())
            System.out.print("Input : ");
        else {
            Iterator<Student> ito = list.iterator();
            while(ito.hasNext())
                ito.next().displayInfo();
        }
    }
    
    public void SearchByID(String id){
    boolean found = false;
        for (Student student : list) {
            if(student.getId().equals(id)){
                student.displayInfo();
                found = true;
                break;
            }
        }
        if(!found)
            System.out.print("Input avg mark: ");
    }
    
    public void deleteById(String id){
    boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(id)){
                list.remove(i);
                found = true;
                System.out.print("Delete student completed !");
                break;
            }
        }
        if(!found)
            System.out.print("Input avg mark: ");
    }
    
    public void SortDESCAVGMark(){
        
            for (int i = 0 ; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).getAvg_mark() < list.get(j).getAvg_mark()) {
                        list.equals(i) = list.equals(j);
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println("The best Student "+(i+1)+":");
                System.out.println("<==========================================>");
                arr[i].display();
            }
        }
    
    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        StudentTest StD = new StudentTest();
        do{
            option = StD.menu();
            switch(option){
                case 1:
                    StD.add();
                    break;
                case 2:
                    StD.displayall();
                    break;
                case 3:
                    System.out.print("Input student ID: ");
                    String id = input.nextLine();
                    StD.SearchByID(id);
                    break;
                case 4:
                    System.out.print("Input student ID: ");
                    String id2 = input.nextLine();
                    StD.deleteById(id2);
                    break;
            }
        } while (option != 5);
    }
    
}
