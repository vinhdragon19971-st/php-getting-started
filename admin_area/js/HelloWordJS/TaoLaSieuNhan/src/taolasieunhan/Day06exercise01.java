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
public class Day06exercise01 {
    
    public int checkDivisor(int n){
        int max = 1;
        for(int i = 1; i < n; i++){
            if((n % i == 0) && (max < i) && (i % 2 != 0)){
                max = i;
            }
        } return max;
    }
        
    
    
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        n = input.nextInt();
        
        Day06exercise01 demo = new Day06exercise01();
        int maxValue = demo.checkDivisor(n);
        System.out.print("maxValue : " + maxValue);                
    }
}
