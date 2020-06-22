/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taolasieunhan;

import java.util.Scanner;
import static vn.viettuts.baitap.array.BaiTap26.scanner;
import static vn.viettuts.baitap.array.BaiTap26.sortASC;

/**
 *
 * @author User
 */
public class CodeTest {
        
    public static float[] input(float[] array) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        array = new float[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        return array;
    }
    
    public static void SapXepThuTu(float [] arr) {
        float temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    public static int NhapAvaB(int array[], int n) {
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        float[] c = new float[cIndex + 1];
        
        // sắp xếp các mảng theo thứ tự tăng dần
        SapXepThuTu(a);
        SapXepThuTu(b);
        
        // trộn mảng a và b thành c
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        int[] mang = new int[100];
        int n;
        
        
        
    }
}