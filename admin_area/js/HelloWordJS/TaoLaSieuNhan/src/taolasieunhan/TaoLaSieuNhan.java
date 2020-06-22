/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taolasieunhan;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class TaoLaSieuNhan {

    public static void main(String[] args) {
        double a, b, c;
        String id, fullname, address;
        double averageMark, totalMark;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input student ID: ");
        id = input.nextLine();
        System.out.print("Input student Name: ");
        fullname = input.nextLine();
        System.out.print("Input student Address: ");
        address = input.nextLine();
        System.out.print("Diem Toan: ");
        a = input.nextDouble();
        System.out.print("Diem Hoa: ");
        b = input.nextDouble();
        System.out.print("Diem Ly: ");
        c = input.nextDouble();
        totalMark   = a + b + c;
        averageMark = totalMark/3;
        
        
        System.out.println("\n Your informations: ");
        System.out.println("StdID: " + id);
        System.out.println("StdName: " + fullname);
        System.out.println("StdAM: " + averageMark);
        
                
    }
    
}
