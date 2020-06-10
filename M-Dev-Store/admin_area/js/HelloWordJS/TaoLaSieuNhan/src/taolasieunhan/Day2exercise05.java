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
public class Day2exercise05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Nhập vào số nguyên bất kỳ: ");
            n = input.nextInt();
            sum += n;  // sum = sum + number;
        }
        System.out.println("Result : " + sum);
    }
    
}
