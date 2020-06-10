/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int yob;
    private float avg_mark;
    
    public Student(){
        id = "";
        name = "";
        yob = 0;
        avg_mark = 0.0f;
    }

    public Student(String id, String name, int yob, float avg_mark) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.avg_mark = avg_mark;
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

    public float getAvg_mark() {
        return avg_mark;
    }

    public void setAvg_mark(float avg_mark) {
        this.avg_mark = avg_mark;
    }
    
    public void displayInfo() {
        System.out.println("Id Student : " + id);
        System.out.println("Name Student : " + name);
        System.out.println("Year Of Birth Student : " + yob);
        System.out.println("AVG Mark Student : " + avg_mark);
    }

    @Override
    public int compareTo(Student o) {
        if(yob < o.yob) return 1;
        else if (yob > o.yob) return -1;
        else{
            return 0;
        }
    }
    
}
