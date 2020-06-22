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
public class Day2exercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        int n;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số nguyên bất kỳ: ");
            n = input.nextInt();
            sum += n;  // sum = sum + number;
        } while (n != 0); 
        System.out.println("Result : " + sum);
    }
    
}
