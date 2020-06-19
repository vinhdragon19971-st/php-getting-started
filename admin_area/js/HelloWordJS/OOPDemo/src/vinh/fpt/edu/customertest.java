/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinh.fpt.edu;

/**
 *
 * @author User
 */
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class customertest {

    /**
     * @param args the command line arguments
     */
    private int maxarr;
    private int nextarr;
    private customer[] arr;
    public customertest(){
    maxarr =100;
    nextarr =0;
    arr = new customer[maxarr];
    
    }

    public void customertest() {
        customer cus = new customer();
        Scanner input = new Scanner(System.in);
        System.out.print("input customer id: ");
        cus.setId(input.next());
        System.out.print("input customernamr:");
        cus.setNameString(input.next());
        System.out.print("input customer sex: ");
        cus.setSex(input.hasNextBoolean());
        System.out.print("input customer address: ");
        cus.setAddresString(input.next());
        System.out.print("input year of birth: ");
        cus.setYob(input.nextInt());
        arr[nextarr++] = cus;
    }
    
    public void  displayall(){
        if (nextarr ==0) {
            System.out.println("empty list");
        } else {
            for (int i = 0; i < nextarr; i++) {
                System.out.println("the information of customer: "+(i+1)+":");
                System.out.println("<==========================================>");
                arr[i].displayinfo();
            }
        }
    }
    
    public void searchbyname(String name){
    boolean found = false;
        for (int i = 0; i < nextarr; i++) {
            if (arr[i].getNameString().equalsIgnoreCase(name)) {
                arr[i].displayinfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("not found!");
        }
    }
    
    public int  menu(){
    Scanner input = new Scanner(System.in);
        System.out.println("\n1. add customer\n2. display all\n3. search by name\n4. exit");
        System.out.print("please enter your option : ");
        int option = input.nextInt();
        return option;
    }
    
    public static void main(String[] args) {
        int option = 0;
        customertest ct = new customertest();
        do{
            option = ct.menu();
            switch(option){
                case 1:
                    ct.customertest();
                    break;
                case 2:
                    ct.displayall();
                    break;
                case 3:
                    ct.searchbyname(null);
                    break;
            }
        } while (option != 4);
        
    }
    
}
