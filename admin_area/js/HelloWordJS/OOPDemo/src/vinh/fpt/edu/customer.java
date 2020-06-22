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
public class customer {
    private String id;
    private String nameString;
    private boolean  sex;
    private String addresString;
    private int yob;

    public customer() {
    }

    public customer(String id, String nameString, boolean sex, String addresString, int yob) {
        this.id = id;
        this.nameString = nameString;
        this.sex = sex;
        this.addresString = addresString;
        this.yob = yob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddresString() {
        return addresString;
    }

    public void setAddresString(String addresString) {
        this.addresString = addresString;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void displayinfo(){
        System.out.println("id:"+ id);
        System.out.println("name:"+ nameString);
        System.out.println("sex:"+sex);
        System.out.println("address"+ addresString);
        System.out.println("year of birth"+ yob);
        
    }
}




