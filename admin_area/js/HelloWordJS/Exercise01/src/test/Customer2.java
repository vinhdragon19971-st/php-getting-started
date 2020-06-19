/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author User
 */
public class Customer2 extends Person implements Isalary{

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return id;
    }
    
}
