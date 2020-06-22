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
public class Day3exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int n;
        int count = 0;
        
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
        System.out.println("Even number: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0){
                count++;
                System.out.println("Number: " + array[i]);
            }
        }
    }
    
}
