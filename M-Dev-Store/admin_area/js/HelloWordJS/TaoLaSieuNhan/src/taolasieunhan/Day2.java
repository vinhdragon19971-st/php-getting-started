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
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập vào số nguyên dương bất kỳ: ");
        n = input.nextInt();
        
        if (n%2 == 0){
            System.out.println("Đây là số nguyên : " + n);
        }
        else{
            System.out.println("Đây không phải là số nguyên : " + n);
        }
    }
    
}
