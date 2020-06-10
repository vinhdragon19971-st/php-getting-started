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
public class Day5Exercise02 {
    
    public boolean findNumber(int[] array, int n){
        for(int i = 2; i <= Math.sqrt(n) ; i++){
                if(n % i == 0) {
                    System.out.print("Đây không phải số nguyên tố");
                    return false;
            }
        }System.out.print("Đây là số nguyên tố");
        return true;
        
    }
    
    
    public static void main(String[] args) {
        int[] mang = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        n = input.nextInt();
        
        
        
        Day5Exercise02 demo = new Day5Exercise02();
        demo.findNumber(mang, n);
    }
}
