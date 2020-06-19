/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author User
 */
public abstract class Person {

    protected String id;
    protected String name;
    protected int yob;
    
    public Person() {
        id = "";
        name = "";
        yob = 0;
    }

    public Person(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public abstract void displayInfo();
    public abstract void input();
}
