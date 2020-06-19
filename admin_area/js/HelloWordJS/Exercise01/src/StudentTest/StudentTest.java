/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentTest;

import java.util.Scanner;
import student.Student;

/**
 *
 * @author User
 */
public class StudentTest extends Student{

    private int maxarr;
    private int nextarr;
    private Student[] arr;
    
    public StudentTest(){
    maxarr =100;
    nextarr =0;
    arr = new Student[maxarr];
    }
    
    public void StudentTest() {
        Student st = new Student();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Student id: ");
        st.setId(input.nextInt());
        System.out.print("Input Student Name: ");
        st.setName(input.nextLine());
        st.setName(input.nextLine());
        System.out.print("Input Address :");
        st.setAddress(input.nextLine());
        st.setAddress(input.nextLine());
        System.out.print("Input Mark :");
        st.setMark(input.nextFloat());
        System.out.print("Input Email :");
        st.setEmail(input.next());
        arr[nextarr++] = st;
    }
    
    public void searchbyname(String name){
    boolean found = false;
        for (int i = 0; i < nextarr; i++) {
            if (arr[i].getName().equalsIgnoreCase(name)) {
                arr[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("not found!");
        }
    }
    
    public void searchbyid(int id){
    boolean found = false;
        for (int i = 0; i < nextarr; i++) {
            if (arr[i].getId() == id) {
                arr[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found!");
        }
    }
    
    public void SortDESCNumber(){
            Student st = arr[0];
            for (int i = 0 ; i < nextarr - 1; i++) {
                for (int j = i + 1; j < nextarr; j++) {
                    if (arr[i].getMark() < arr[j].getMark()) {
                        st = arr[j];
                        arr[j] = arr[i];
                        arr[i] = st;
                    }
                }
            }
            for (int i = 0; i < nextarr; i++) {
                System.out.println("The best Student "+(i+1)+":");
                System.out.println("<==========================================>");
                arr[i].display();
            }
        }
    
    public void MaxMark() {
        Student st = arr[0];
        if (nextarr == 0) {
            System.out.println("empty list");
        } 
        else {
            for (int i = 0; i < nextarr; i++) {
                if (st.getMark() < arr[i].getMark()){
                    st = arr[i];
                }
            }
            System.out.println("Max Mark is : " + st);
        }
    }
    
    public void  displayall(){
        if (nextarr == 0) {
            System.out.println("empty list");
        } 
        else {
            for (int i = 0; i < nextarr; i++) {
                System.out.println("the information of Student: "+(i+1)+":");
                System.out.println("<==========================================>");
                arr[i].display();
            }
        }
    }
    
    public int  menu(){
    Scanner input = new Scanner(System.in);
        System.out.println("\n1. Add new student\n2. Seach student by name"
                +"3. Search student by id\n4. Display all student\n5.SortDESC Mark"
                +"\n6.MaxMark\n7.Exit");
        System.out.print("please enter your option : ");
        int option = input.nextInt();
        return option;
    }
    
    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        StudentTest st = new StudentTest();
        do{
            option = st.menu();
            switch(option){
                case 1:
                    st.StudentTest();
                    break;
                case 2:
                    System.out.print("Input student name: ");
                    String name = input.next();
                    st.searchbyname(name);
                    break;
                case 3:
                    System.out.print("Input student id: ");
                    int id = input.nextInt();
                    st.searchbyid(id);
                    break;
                case 4:
                    st.displayall();
                    break;
                case 5:
                    st.SortDESCNumber();
                    break;
                case 6:
                    st.MaxMark();
                    break;
                default:
                    System.out.print("Wrong input!!!!!!!!!! Input cmm à ?????");
                    break;
            }
        } while (option != 7);
    }
    
}
