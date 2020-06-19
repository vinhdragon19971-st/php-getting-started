/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinh.fpt.vn;

import OopTest.person;

/**
 *
 * @author User
 */
public class student extends person {
    private float mark;
    
    public student(){
        super();
        mark = 100.5f;
        System.out.println("This is student Class");
    }
    
    public void show(){
        System.out.println("Mark : " + mark);
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Mark : " + mark);
    }
    
    public void show(String mess){
        System.out.println(mess);
    }
}
