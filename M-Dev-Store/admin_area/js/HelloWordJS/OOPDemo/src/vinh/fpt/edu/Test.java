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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student a = new Student();
        a.display();
        Student b = new Student("S001", "Angela Phuong Trinh", 1997);
        b.display();
        
        a.setId("S123");
        a.display();
    }
    
}
