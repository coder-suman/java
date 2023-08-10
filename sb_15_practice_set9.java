package com.company;

class Cylinder{
    private int redius;
    private int hight;

    public Cylinder(int redius, int hight) {
        this.redius = redius;
        this.hight = hight;
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public double get_surfacearea(){
        return 2*Math.PI*redius*hight + 2*Math.PI*redius*redius;
    }
    public double get_surfacevolume(){
        return Math.PI*redius*redius*hight;
    }

}

class MyRectangle{
    private int length;
    private int breath;

    public MyRectangle() {
        length=4;
        breath=5;
    }
    public MyRectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }


}

class Sphere{
    private int redius;

    public Sphere(int redius){
        this.redius=redius;
    }

    public double get_sphere_area(){
        return 4*Math.PI*redius*redius;
    }
    public double get_sphere_volume(){
        return 1.33333333*Math.PI*(redius*redius*redius);
    }
}
public class sb_15_practice_set9 {
    public static void main(String[] args) {

        /*//problem.1
        Cylinder cy=new Cylinder();
        cy.setRedius(9);
        cy.setHight(12);
        System.out.println("The redius is: "+cy.getRedius());
        System.out.println("The hight is: "+cy.getHight());

        //problem.2
        System.out.println("The area of cylinder is: "+cy.get_surfacearea());
        System.out.println("The volume of cylinder is: "+cy.get_surfacevolume());

        //problem.3
        Cylinder cy =new Cylinder(9,12);
        System.out.println("The redius is: "+cy.getRedius());
        System.out.println("The hight is: "+cy.getHight());

        //problem.4
//        MyRectangle rc=new MyRectangle();
//        System.out.println("The length of rectangle is: "+rc.getLength());
//        System.out.println("The breath of rectangle is: "+rc.getBreath());

        MyRectangle rc=new MyRectangle(6,7);
        System.out.println("The length of rectangle is: "+rc.getLength());
        System.out.println("The breath of rectangle is: "+rc.getBreath());

        //problem.5
        Sphere sp=new Sphere(9);
        System.out.println("The area of spere is: "+sp.get_sphere_area());
        System.out.println("The volume of spere is: "+sp.get_sphere_volume());*/



    }
}
