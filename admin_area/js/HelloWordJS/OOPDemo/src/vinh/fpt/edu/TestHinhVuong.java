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
public class TestHinhVuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhVuong a = new HinhVuong();
        a.display();
        HinhVuong b = new HinhVuong(200);
        b.display();
        
        a.setCanh(6);
        a.display();
    }
    
}
