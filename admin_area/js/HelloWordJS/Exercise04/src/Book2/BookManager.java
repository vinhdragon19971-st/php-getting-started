/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BookManager {

    private Map<String, Book> map = new HashMap<>();
    
    public void AddBook(){
        Scanner input = new Scanner(System.in);
        Book b = new Book();
        try{
            System.out.print("Input ID Book: ");
            b.setBookID(input.nextLine());
            System.out.print("Input Category Book: ");
            b.setCategory(input.nextLine());
            System.out.print("Input Title Book: ");
            b.setTitle(input.nextLine());
            System.out.print("Input Author Book: ");
            b.setAuthor(input.nextLine());
            System.out.print("Input Price Book: ");
            b.setPrice(input.nextDouble());
            map.put(b.getBookID(), b);
        }catch(Exception ex){
            System.out.print("Error: "+ ex.getMessage());
        }
    }
    
    public void Publishtheentirelist() {
        if(map.isEmpty()){
            System.out.print("Not data Student !!!");
        }
        else{
            for(Book value : map.values()){
                System.out.print(value.toString());
            }
        }
    }
    
    public void SearchbookbyTitle(String title){
        boolean found = false;
        if(map.containsKey(title)){
            map.get(title).toString();
        }
    }
    
    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Create new book\n2. Publish the entire list"
                + "\n3. Search book by title\n4. Exit");
        System.out.print("Input your option: ");
        int option = input.nextInt();
        return option;
        
    }
    
    public static void main(String[] args) {
        int option = 0;
        BookManager bm = new BookManager();
        Scanner input = new Scanner(System.in);
        do{
            try{
            option = bm.menu();
            switch(option){
                case 1:
                    bm.AddBook();
                    break;
                case 2:
                    bm.Publishtheentirelist();
                    break;
                case 3:
                    System.out.print("Input Title: ");
                    String title = input.nextLine();
                    bm.SearchbookbyTitle(title);
                default:
                    System.out.print("Error option !");
            }
        }catch (Exception Ex){
            System.out.print("Error: " + Ex.getMessage());
        }
        } while (option != 4);
        
    }
    
}
