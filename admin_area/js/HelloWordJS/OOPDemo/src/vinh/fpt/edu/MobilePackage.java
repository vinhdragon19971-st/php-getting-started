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
public class MobilePackage {
    private String Model;
    private float Price;
    private String Brand;
    private int year;
    
    public MobilePackage() {
        Model = "";
        Price = 0.0f;
        Brand = "";
        year = 0;
    }
    
    public MobilePackage(String Model, float Price, String Brand, int year){
        this.Model = Model;
        this.Price = Price;
        this.Brand = Brand;
        this.year = year;
    }
    
    
    public void display(){
        System.out.println("Model : " + Model);
        System.out.println("Price : " + Price);
        System.out.println("Brand : " + Brand);
        System.out.println("year : " + year);
    }
}
