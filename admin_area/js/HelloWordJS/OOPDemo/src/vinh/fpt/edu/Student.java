/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinh.fpt.edu;

/**
 *
 * @author User
 */
public class Student {
    private String id;
    private String name;
    private int yob;
    
    public Student() {
        id = "";
        name = "";
        yob = 2000;
    }
    
    public Student(String i, String n, int y){
        id = i;
        name = n;
        yob = y;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String i){
        id = i;
    }
    
    public void display(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + yob);
    }
}
