/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author User
 */
public class Person {
    protected int id;
    protected String name;
    protected String address;
    
    public Person(){
        id = 001;
        name = "Vinh Chơi Đá";
        address = "142 Phạm Phú Thứ";
    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    public void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }
}
