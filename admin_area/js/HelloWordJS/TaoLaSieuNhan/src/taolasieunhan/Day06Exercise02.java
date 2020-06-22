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
public class Day06Exercise02 {

    public int finalEvenNumber(int[] array, int n){
        int x = -1;
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0){
                x = array[i];
            }
        }
        return x;
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
        
        Day06Exercise02 demo = new Day06Exercise02();
        demo.inputArray(mang, n);
        System.out.println("Your array: ");
        demo.outputArray(mang, n);
        System.out.println("Final Even Number : " + demo.finalEvenNumber(mang, n));
    }
}