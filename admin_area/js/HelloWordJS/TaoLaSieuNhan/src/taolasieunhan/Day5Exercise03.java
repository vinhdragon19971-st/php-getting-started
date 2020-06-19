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
public class Day5Exercise03 {

    public void inputArray(int[] array, int n){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Input value at position #" + i + ": ");
            array[i] = input.nextInt();
        }
    }
    
    public void outputArray(int[] array, int n){
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
    
    public Boolean checkMax(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        } return true;
    }
    
        public int findMax(int a[],int n)
    {
        int dem=0;
        int max = 0;
        int i;
        Day5Exercise03 demo = new Day5Exercise03();
        for(i = 0; i < n; i++)
        {
            if(demo.checkMax(a[i])== true)
            {
                dem ++;
                max = a[i];
                break;
            }
        }
//        if (max == 0)
//            System.out.print("Không có số nguyên tố");
        for (i = i + 1; i < n; i++)
        {
            if ((demo.checkMax(a[i])== true) && (max<a[i]))
            {
                max = a[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] mang = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        n = input.nextInt();
        
        
        
        Day5Exercise03 demo = new Day5Exercise03();
        demo.inputArray(mang, n);
        System.out.println("Your array: ");
        demo.outputArray(mang, n);
        int maxValue = demo.findMax(mang, n);
        if (maxValue== 0){
            System.out.print("\nko co so nt");
        } else
            System.out.print("\nMax Value is: " + maxValue);

            
    }
}