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
public class TestTamGiac {

    /**
     * @param args the command line arguments
     */
    private HinhTamGiac[] list;
    private int n;
    
    public TestTamGiac(){
        list = new HinhTamGiac[100];
    }
    
    public int menu(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n1.Nhập n tam giác\n2.Xuất n Tam Giác"
        + "\n3.Đếm Tam Giác Cân\n4. Đếm Tam Giác Đều"
        + "\n5. Show isosceles triangles\n6. Show equilateral triangles"
        + "\n7. Exit");
        System.out.print("\nPleas input your option: ");
        int option = input.nextInt();
        return option;
    }
    
    public void inputTriangles(){
        Scanner input = new Scanner(System.in);
        System.out.print("Pleas input number of triangles: ");
        n = input.nextInt();
        float canh1, canh2, canh3;
        for (int i = 0; i < n; i++){
            System.out.println("Input the informations of triangles #" + (i+1) + ":");
            System.out.print("Cạnh 1 : ");
            canh1 = input.nextFloat();
            System.out.print("Cạnh 2 : ");
            canh2 = input.nextFloat();
            System.out.print("Cạnh 3 : ");
            canh3 = input.nextFloat();
            HinhTamGiac tg = new HinhTamGiac(canh1, canh2, canh3);
            list[i] = tg;
        }
    }
    
    public void outputTriangles(){
        for(int i = 0; i < n; i++){
            System.out.print("\nThe information of triangle #" + (i+1) + ":");
            list[i].display();
        }
    }
    
    public int DemTamGiacCan(){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(list[i].tamgiaccan()) count++;
        }
        return count;
    }
    
    public void XuatDemTamGiacCan(){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(list[i].tamgiaccan()){
                list[i].display();
                count++;
            }
        }
        if(count == 0){
            System.out.print("Đéo có tam giác cân nào cả");
        }
    }
    
    public int DemTamGiacDeu(){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(list[i].tamgiacdeu()) count++;
        }
        return count;
    }
    
    public void XuatDemTamGiacDeu(){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(list[i].tamgiacdeu()){
                list[i].display();
                count++;
            }
        }
        if(count == 0){
            System.out.print("Đéo có tam giác đều nào cả");
        }
    }
    
    public static void main(String[] args) {
        int option = 0;
        TestTamGiac tg = new TestTamGiac();
        do{
            option = tg.menu();
            switch(option){
                case 1:
                    tg.inputTriangles();
                    break;
                case 2:
                    tg.outputTriangles();
                    break;
                case 3:
                    int count1 = tg.DemTamGiacCan();
                    System.out.print("\n Có" + count1 + "Tam Giác Cân");
                    break;
                case 4:
                    int count2 = tg.DemTamGiacDeu();
                    System.out.print("\n Có" + count2 + "Tam Giác Đều");
                    break;
                case 5:
                    tg.XuatDemTamGiacCan();
                    break;
                case 6:
                    tg.XuatDemTamGiacDeu();
                    break;
            }
        } while (option != 7);
    }
    
}
