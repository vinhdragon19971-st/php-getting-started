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
public abstract class Person {
    protected int id;
    protected String name;
    
    public Person() {
        id = 0;
        name = "Ngọc Trinh";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void displayInfo();
    public abstract String getName();
    public abstract int getID();
}
