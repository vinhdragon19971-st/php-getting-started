/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopTest;

/**
 *
 * @author User
 */
public class person{
    protected String id;
    protected String name;
    
    public person(){
        id = "S001";
        name = "Ngoc Trinh";
        System.out.println("This is person Class");
    }
    
    public void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}
