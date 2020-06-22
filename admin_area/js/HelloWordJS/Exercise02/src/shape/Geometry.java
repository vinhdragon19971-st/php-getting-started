/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author User
 */
public abstract class Geometry {
    protected double calculateArea;
    protected double calculatePerimeter;
    
    public Geometry() {
        calculateArea = 0;
        calculatePerimeter = 0;
    }

    public Geometry(double calculateArea, double calculatePerimeter) {
        this.calculateArea = calculateArea;
        this.calculatePerimeter = calculatePerimeter;
    }
    
    

    public void setCalculateArea(double calculateArea) {
        this.calculateArea = calculateArea;
    }

    public void setCalculatePerimeter(double calculatePerimeter) {
        this.calculatePerimeter = calculatePerimeter;
    }
    
    public abstract void displayInfo();
    public abstract double getcalculateArea();
    public abstract double getCalculatePerimeter();
}
