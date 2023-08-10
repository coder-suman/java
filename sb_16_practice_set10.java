package com.company;

class circle1{
    int redius;
    public circle1(int r){
        redius=r;
    }
    public double area1(){
        return Math.PI*redius*redius;
    }
}
class cylinder1 extends circle1{
    int hight;
    public cylinder1(int r,int h){
        super(r);
        hight=h;
    }
    public double area(){
        return 2*Math.PI*redius*hight + 2*Math.PI*redius*redius;
    }
}

class Rectangle1{
    int lenght;
    int width;
    public Rectangle1(int l,int w){
        lenght=l;
        width=w;
    }
    public int area(){
        return lenght*width;
    }
}
class cube extends Rectangle1{
    int side;

    public cube(int l, int w,int a) {
        super(l, w);
        side=a;
    }
    public int area1(){
        return 6*side*side;
    }
}

public class sb_16_practice_set10 {
    public static void main(String[] args) {

        //problem.1
//        circle1 c2=new circle1(5);
        cylinder1 c1=new cylinder1(6,3);
        System.out.println(c1.area());
        System.out.println(c1.area1());

       // problem.2
        cube cu=new cube(4,5,6);
        System.out.println(cu.area());
        System.out.println(cu.area1());
    }
}
