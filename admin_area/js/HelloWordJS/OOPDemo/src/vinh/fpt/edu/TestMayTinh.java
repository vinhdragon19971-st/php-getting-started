/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinh.fpt.edu;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestMayTinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Input a = ");
        a = input.nextInt();
        System.out.print("Input b = ");
        b = input.nextInt();
        
        MayTinh mt = new MayTinh( a, b);
        mt.display();
        
    }
    
}
