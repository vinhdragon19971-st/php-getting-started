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
public class MayTinh {
    private int SoX;
    private int SoY;
    
    public MayTinh() {
        SoX = 2000;
        SoY = 2000;
    }
    
    public MayTinh(int x, int y){
        SoX = x;
        SoY = y;
    }
    
    public int getx() {
        return SoX;
    }
    
    public void setx(int x){
        SoX = x;
    }
    
    public int cong(){
        return (SoX+SoY);
    }
    
    public int tru(){
        return (SoX-SoY);
    }
    
    public int nhan(){
        return (SoX*SoY);
    }
    
    public float chia(){
        if (SoY != 0){
            return ((float)SoX/SoY);
        }
        return Float.MAX_VALUE;
    }
    
    public void display(){
        System.out.println("Cộng: " + cong());
        System.out.println("Trừ : " + tru());
        System.out.println("Nhân: " + nhan());
        System.out.println("Chia: " + chia());
    }
}
