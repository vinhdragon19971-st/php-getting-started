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
public class Day2exercise06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d = 0;
        int n = 0;
        
                  
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("===== Chọn phép tính =====");
            System.out.println("1. Cộng");
            System.out.println("2. Trừ");
            System.out.println("3. Nhân");
            System.out.println("4. Chia");
            System.out.println("5. Thoát");
            System.out.println("==============================");
            c = input.nextInt();
            
            if (c == 1){
            do{
                System.out.print("Nhập vào số a bất kỳ: ");
                a = input.nextInt();
                System.out.print("Nhập vào số b bất kỳ: ");
                b = input.nextInt();
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a + b = " + (a+b));
                System.out.println("1. Tiếp Tục");
                System.out.println("2. Thoát");
                d = input.nextInt();
               }while (d != 2);
            }
            if (c == 2){
            do{
                System.out.print("Nhập vào số a bất kỳ: ");
                a = input.nextInt();
                System.out.print("Nhập vào số b bất kỳ: ");
                b = input.nextInt();
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a - b = " + (a-b));
                System.out.println("1. Tiếp Tục");
                System.out.println("2. Thoát");
                d = input.nextInt();
               }while (d != 2);
            }
            if (c == 3){
            do{
                System.out.print("Nhập vào số a bất kỳ: ");
                a = input.nextInt();
                System.out.print("Nhập vào số b bất kỳ: ");
                b = input.nextInt();
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a x b = " + (a*b));
                System.out.println("1. Tiếp Tục");
                System.out.println("2. Thoát");
                d = input.nextInt();
               }while (d != 2);
            }
            if (c == 4){
            do{
                System.out.print("Nhập vào số a bất kỳ: ");
                a = input.nextInt();
                System.out.print("Nhập vào số b bất kỳ: ");
                b = input.nextInt();
                System.out.println("Kết quả: a = " + a + " và b = " + b + " -- a / b = " + ((float)a/b));
                System.out.println("1. Tiếp Tục");
                System.out.println("2. Thoát");
                d = input.nextInt();
               }while (d != 2);
            }
        } while (c != 5); 
    }
    
}
