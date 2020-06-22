/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taolasieunhan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class InputTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c, d, e;
        float f;
        int a, b;
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        System.out.print("Nhập a: "); 
        a = input.nextInt();
        System.out.print("Nhập b: ");
        b = input.nextInt();
        
        c = a + b;
        d = a - b;
        e = a * b;
        f = (float) a / b;
        
        System.out.println("a = " + a + ", b = " + b + " | a + b = " + c);
        System.out.println("a = " + a + ", b = " + b + " | a - b = " + d);
        System.out.println("a = " + a + ", b = " + b + " | a * b = " + e);
        System.out.println("a = " + a + ", b = " + b + " | a / b = " + decimalFormat.format(f));
    }
    
}
