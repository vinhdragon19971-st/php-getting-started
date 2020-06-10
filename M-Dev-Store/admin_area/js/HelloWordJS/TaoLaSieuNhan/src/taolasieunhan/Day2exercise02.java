/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taolasieunhan;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Day2exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b;
        String c;
        
        System.out.print("Nhập vào số a bất kỳ: ");
        a = input.nextInt();
        System.out.print("Nhập vào số b bất kỳ: ");
        b = input.nextInt();
        System.out.print("Nhập vào phép toán bất kỳ: ");
        c = input.next();
        switch (c) {
            case "+":
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a + b = " + (a+b));
                break;
            case "-":
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a - b = " + (a-b));
                break;
            case "*":
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a x b = " + (a*b));
                break;
            case "/":
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a / b = " + ((float)a/b));
                break;
            default:
                System.out.println("Your input operator is not valid!");
                break;
        }
        
    }
    
}
