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
public class TaoLaSieuNhan {

    public static void main(String[] args) {
        double a, b, c, d, e,f;

        Scanner input = new Scanner(System.in)
        System.out.print("Nhập a: "); 
        a = input.nextInt();
        System.out.print("Nhập b: ");
        b = input.nextInt();
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;
        
        System.out.println("a = " + a + ", b = " + b + " | a + b = " + c);
        System.out.println("a = " + a + ", b = " + b + " | a - b = " + d);
        System.out.println("a = " + a + ", b = " + b + " | a * b = " + e);
        System.out.println("a = " + a + ", b = " + b + " | a / b = " + f);
        
                
    }
    
}
