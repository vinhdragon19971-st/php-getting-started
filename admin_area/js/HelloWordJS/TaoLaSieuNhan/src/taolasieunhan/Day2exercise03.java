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
public class Day2exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, result = 0;
        int count;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số n bất kỳ: ");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                result += i;
            }
        }
            
        
        System.out.print("Result :" + result);
    }
    
}
