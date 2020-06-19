
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentTest {
    
    private List<Student> list = new Vector();
    
    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n1. Add student\n2. Display all"
                + "\n.3. Search by id\n4. Delete student by id"
                + "5. Exit");
        int option = input.nextInt();
        return option;
    }
    
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
            list.add(st);
        }catch(Exception ex){
            System.out.print("Error is " + ex.getMessage());
        }
    }
    
    public void displayall(){
        if(list.isEmpty()){
            System.out.print("Input Information Student !!! PLeas");
        }
        else {
            Iterator<Student> ito = list.iterator();
            while(ito.hasNext()){
                ito.next().displayInfo();
            }
        }
    }
    
    public void SearchbyID(String id){
        boolean found = false;
            for (Student stdid : list){
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
    
    public void deleteByID(String id){
        boolean found = false;
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).equals(id)){
                list.remove(i);
                found = true;
                System.out.print("Delete student complete !!!");
                break;
            }
        }
        if(!found){
            System.out.print("Nothing ID have delete !!!");
        }
    }
    
    public void SortDescAVGMark(){
        
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).getAvg_mark() < list.get(j).getAvg_mark()){
                    
                }
            }
        }
    }

        
    public static void main(String[] args) {
        
    }
        
}
