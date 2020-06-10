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
public class Day4exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, x, y;
        int i;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements in your array: ");
        n = input.nextInt();
        int[] array = new int[n];
        //input values
        for(i = 0; i < n; i++){
            System.out.print("Input value at position " + i + ": ");
            array[i]= input.nextInt();
        }
        
        int value;
        System.out.print("Con số cần để xóa: ");
        value = input.nextInt();
        for(i = 0; i < n; i++){
            if(array[i] == value){
                for(int j = i; j < n; j++){
                    array[j] = array[j+1];
                }break;
            }
        }
        n--;
        
        
        System.out.print("\nYour array after inser new value is: ");
        
        for(i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        
     
    }
    
}
