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
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n, soDu, tong = 0;
    Scanner scanner = new Scanner(System.in);
         
    System.out.print("Nhập vào số nguyên dương bất kỳ: ");
    n = scanner.nextInt();
         
    if (n > 0) {
        soDu = n % 10;
        n = n / 10;
        tong += soDu;
    }
         
    System.out.println("Tổng các chữ số = " + tong);
    }
    
}
