/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import person.Person;

/**
 *
 * @author User
 */
public class Student extends Person{
    protected Float mark;
    protected String email;
    
    public Student(){
        super();
        mark = 100.5f;
        email = "vinhchoida123@gamil.com";
    }

    public Student(Float mark, String email, int id, String name, String address) {
        super(id, name, address);
        this.mark = mark;
        this.email = email;
    } 
    
    
    @Override
    public void display(){
        super.display();
        System.out.println("Mark : " + mark);
        System.out.println("email : " + email);
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
