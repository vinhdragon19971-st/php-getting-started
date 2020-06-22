/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;
import shape.Geometry;

/**
 *
 * @author User
 */
public class Rectangle extends Geometry{
    protected double Width;
    protected double Length;

    public Rectangle(double Width, double Length) {
        this.Width = Width;
        this.Length = Length;
    }

    public Rectangle() {
        Width = 0;
        Length = 0;
    }
    
    public void inputWL() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Width  : ");
        this.Width = input.nextDouble();
        System.out.println("Input Length : ");
        this.Length = input.nextDouble();
    }

    @Override
    public void displayInfo() {
        Rectangle rec = new Rectangle();
        System.out.println("Width : " + Width);
        System.out.println("Length : " + Length);
        System.out.println("Rectangular area : " + rec.getcalculateArea());
        System.out.println("Rectangular area : " + rec.getCalculatePerimeter());
    }

    @Override
    public double getcalculateArea() {
        return (Width * Length);
    }

    @Override
    public double getCalculatePerimeter() {
        return ((Width + Length) * 2);
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }
    
    
    
}
