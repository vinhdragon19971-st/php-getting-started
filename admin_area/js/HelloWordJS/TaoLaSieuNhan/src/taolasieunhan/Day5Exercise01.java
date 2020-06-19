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
public class Day5Exercise01 {

    public void inputArray(int[] array, int n){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Input value at position #" + i + ": ");
            array[i] = input.nextInt();
        }
    }
    
    public void outputArray(int[] array, int n){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
    
    public int findMax(int[] array, int n){
        int max = array[0];
        for(int i = 1; i < n; i++){
                if(max < array[i]) {
                    max = array[i];
            }
        }return max;
    }
    
    
    public static void main(String[] args) {
        int[] mang = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        n = input.nextInt();
        
        
        
        Day5Exercise01 demo = new Day5Exercise01();
        demo.inputArray(mang, n);
        System.out.print("Your array: ");
        demo.outputArray(mang, n);
        int maxValue = demo.findMax(mang, n);
        System.out.print("\nMax Value is: " + maxValue);
    }
}
