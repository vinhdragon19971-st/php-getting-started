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
public class Day3exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements in your array: ");
        n = input.nextInt();
        int[] array = new int[n];
        //input values
        for(int i = 0; i < n; i++){
            System.out.print("Input value at position " + i + ": ");
            array[i]= input.nextInt();
        }
        
        System.out.println("========================");
        System.out.println("Your Array is: ");
        for (int i = 0; i < n; i++) {
        System.out.println("Phần tử thứ " + i + ": " + array[i]);
        }
    }
    
}
