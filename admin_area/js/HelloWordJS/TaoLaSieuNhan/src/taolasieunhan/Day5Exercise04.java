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
public class Day5Exercise04 {
    
    public boolean findNumber(int n){
        double a = Math.sqrt(n);
        return (a*a == (double)n);
        }
    
    
    public static void main(String[] args) {
        int[] mang = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        n = input.nextInt();
        
        
        
        Day5Exercise04 demo = new Day5Exercise04();
        if(demo.findNumber(n) == true){
            System.out.print("Đây là số chính phương");
        }
        else if(demo.findNumber(n) == false){
            System.out.print("Đây không phải số chính phương");
        }
    }
}
