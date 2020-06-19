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
public class HinhTamGiac {
    private float canh1;
    private float canh2;
    private float canh3;
    
    public HinhTamGiac() {
        canh1 = 0.0f;
        canh2 = 0.0f;
        canh3 = 0.0f;
    }
    
    public HinhTamGiac(float canh1, float canh2, float canh3){
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    
    public float chuvitamgiac(){
        return (canh1 + canh2 + canh3);
    }
    
    public boolean tamgiaccan(){
        if (canh1 == canh2){
            return true;
        }
        else if (canh1 == canh3){
            return true;
        }
        else if (canh2 == canh3){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean tamgiacdeu(){
        if ((canh1 == canh2) && (canh1 == canh3)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public void display(){
        int count = 0;
        System.out.println("===============================================================");
        System.out.println("Cạnh 1 = " + canh1 + "/nCạnh 2 = " + canh2 + "/nCạnh 3 = " + canh3);
        System.out.println("Chu Vi Tam Giác : " + chuvitamgiac());
        if (tamgiaccan() == true){
            count++;
            System.out.println("Đây là tam giác cân");
        }
        if (tamgiacdeu() == true){
            count++;
            System.out.println("Đây là tam giác đều");
        }
    }
}
