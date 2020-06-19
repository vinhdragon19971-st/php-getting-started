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
public class HinhVuong {
    private int canh;
    
    public HinhVuong() {
        canh = 20;
    }
    
    public HinhVuong(int i){
        canh = i;
    }
    
    public int getCanh() {
        return canh;
    }
    
    public void setCanh(int i){
        canh = i;
    }
    
    public void display(){
        System.out.println("Dien Tich Hinh Vuong: " + canh*canh);
    }
}
