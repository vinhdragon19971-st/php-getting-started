/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class BookManager {

     private Map<String, Book> map = new TreeMap<>();
     
     public void addBook(){
        Scanner input = new Scanner(System.in);
        Book st =  new Book();
        try{
            System.out.print("Input BookID: ");
            st.setBookID(input.nextLine());
            System.out.print("Input Category: ");
            st.setCategory(input.nextLine());
            System.out.print("Title Book : ");
            st.setTitle(input.nextLine());
            System.out.print("Author Book: ");
            st.setAuthor(input.nextLine());
            System.out.print("Price Book: ");
            st.setPrice(input.nextFloat());
            map.put(st.getBookID(), st);
        }catch(Exception ex){
            System.out.print("Error is " + ex.getMessage());
        }
    }
     
     public void displayall(){
        if (map.isEmpty()) System.out.println("\nEmty List");
        else{
            for (Book value : map.values()) {
                System.out.println(value.toString());
            }
        }        
    }
    
    public void SearchbyTitle(String title){
        boolean found = false;
            if(map.containsKey(title)){
                map.get(title).toString();
                found = true;
            }
            else{
                System.out.println("\nNot Found!\n");
            }            
    }
    
    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Create new book\n2. Publish the entire list"
                + "\n3. 3. Search book by title\n4. Exit");
        System.out.print("Input your option: ");
        int option = input.nextInt();
        return option;
    }
     
    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        BookManager bm = new BookManager();
        do{
            try{
                option = bm.menu();
            switch(option){
                case 1:
                    bm.addBook();
                    break;
                case 2:
                    bm.displayall();
                    break;
                case 3:
                    System.out.print("Input Book ID: ");
                    String title = input.nextLine();
                    bm.SearchbyTitle(title);
                    break;
            }
            }catch (Exception ex){
                System.out.print("Error is " + ex.getMessage());
            }
        } while (option != 4);
    }
    
}
