
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentTest3 {

    private Map<String, Student> map = new HashMap<>();
    
    public void addStudent(){
        Scanner input = new Scanner(System.in);
        Student st =  new Student();
        try{
            System.out.print("Input ID Student: ");
            st.setId(input.nextLine());
            System.out.print("Input Name Student: ");
            st.setName(input.nextLine());
            System.out.print("Input YoB Student: ");
            st.setYob(input.nextInt());
            System.out.print("Input AVG Mark Student: ");
            st.setAvg_mark(input.nextFloat());
            map.put(st.getId(), st);
        }catch(Exception ex){
            System.out.print("Error is " + ex.getMessage());
        }
    }
    
    public void displayall(){
        if (map.isEmpty()) System.out.println("\nEmty List");
        else{
            for (Student value : map.values()){
                value.displayInfo();
            }
        } 
    }
    
    public void SearchbyID(String id){
        boolean found = false;
            if(map.containsKey(id)){
                map.get(id).displayInfo();
            }
            else{
                System.out.println("\nNot Found!\n");
            }
    }
    
    public void DeleteID(String id){
        boolean found = false;
            if(map.containsKey(id)){
                map.remove(id);
                System.out.print("Delete Complete !!!");
            }
            else{
                System.out.println("\nNot Found!\n");
            }
    }
    
    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Add student\n2. Display all"
                + "\n3. Search by id\n4. Delete student by id"
                + "\n5. Exit");
        System.out.print("Input your option: ");
        int option = input.nextInt();
        return option;
    }
    
    public static void main(String[] args) {        
        int option = 0;
        Scanner input = new Scanner(System.in);
        StudentTest3 StD = new StudentTest3();
        do{
            try{
                option = StD.menu();
            switch(option){
                case 1:
                    StD.addStudent();
                    break;
                case 2:
                    StD.displayall();
                    break;
                case 3:
                    System.out.print("Input student ID: ");
                    String id = input.nextLine();
                    StD.SearchbyID(id);
                    break;
                case 4:
                    System.out.print("Input student ID: ");
                    String id2 = input.nextLine();
                    StD.DeleteID(id2);
                    break;
            }
            }catch (Exception ex){
                System.out.print("Error is " + ex.getMessage());
            }
        } while (option != 5);
    }
    
}
