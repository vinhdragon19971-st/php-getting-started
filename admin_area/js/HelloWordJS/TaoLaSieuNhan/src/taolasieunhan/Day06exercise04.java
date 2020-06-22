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
public class Day06exercise04 {

    public static int findNumber(int array[], int n) {
        Scanner input = new Scanner(System.in);
        int r = -1;
        int i;
        int x,y ;
        System.out.print("Number X: ");
        x = input.nextInt();
        System.out.print("Number Y: ");
        y = input.nextInt();
        
        for(i = 0; i < n; i++) {
            if ((array[i] > x) && (array[i] < y)){
               if(r > array[i]) {
                    r = array[i];
                }
            }
        }
        return r;
    }
        
    public void inputArray(int[] array, int n){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Input value at position #" + i + ": ");
            array[i] = input.nextInt();
        }
    }
    
    public void outputArray(int[] array, int n){
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] mang = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        n = input.nextInt();
        
        Day06exercise04 demo = new Day06exercise04();
        demo.inputArray(mang, n);
        System.out.println("Your array: ");
        demo.outputArray(mang, n);
        System.out.println("Final Even Number : " + demo.findNumber(mang, n));
    }
}