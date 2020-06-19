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
public class Day3exercise04 {

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
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < n; i++) {
            if(max < array[i]) 
                max = array[i];
            if(min > array[i]) 
                min = array[i];
        }
        int max2 = min;
        int min2 = max;
        for (int i = 0; i < n; i++){
            if(max2 < array[i] && array[i] < max) max2 = array[i];
            if(min2 > array[i] && array[i] > min) min2 = array[i];
        }
        
        System.out.println("Maximum value of array is " + max);
        System.out.println("Minimum value of array is " + min);
        System.out.println("Maximum value of array is " + max2);
        System.out.println("Minimum value of array is " + min2);
    }
}
