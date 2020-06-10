
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentTest2 {

    private final Set<Student> set = new TreeSet<>();
    
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
            set.add(st);
        }catch(Exception ex){
            System.out.print("Error is " + ex.getMessage());
        }
    }
    
    public void displayall(){
        if(set.isEmpty()){
            System.out.print("Input Information Student !!! PLeas");
        }
        else {
            Iterator<Student> ito = set.iterator();
            while(ito.hasNext()){
                System.out.print("Information Student !!!");
                ito.next().displayInfo();
            }
        }
    }
    
    public void SearchbyID(String id){
        boolean found = false;
            for (Student stdid : set){
                if(stdid.getId().equals(id)){
                    stdid.displayInfo();
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print("Input avg mark: ");
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
        StudentTest2 StD = new StudentTest2();
        do{
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
                    break;
            }
        } while (option != 5);
    }
    
}
