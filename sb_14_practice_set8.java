package com.company;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public void get_name(){
        System.out.println("The name is: "+name);
    }
    public void set_Name(String n) {
        name = n;
    }
}

class cellphone{
    public void call(){
        System.out.println("Calling kuntal...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int a;
    int b;

    public int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a+b);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy.");
    }
    public void run(){
        System.out.println("Running from the enemy.");
    }
    public void fire(){
        System.out.println("Firing on the enemy.");
    }
}

class circle{
    float r;
    float p=3.14f;

    public void area(){
        float x=p*(r*r);
        System.out.println("The area of circle is: "+x);
    }
    public void perimeter(){
        float x= 2*p*r;
        System.out.println("The perimeter of circle is: "+x);
    }
}
public class sb_14_practice_set8 {
    public static void main(String[] args) {

        //problem.1
        Employee s=new Employee();
        s.salary=20000;
        s.name="Suman";
        System.out.println("The salary is: "+s.getSalary());
        s.get_name();
        s.set_Name("Coder-suman");
        s.get_name();

        //problem.2
        cellphone phone=new cellphone();
        phone.call();
        phone.vibrate();
        phone.ring();

        //problem.3
        square sc=new square();
        sc.side=3;
        System.out.println("The area of square is: "+sc.area());
        System.out.println("The perimeter of square is: "+sc.perimeter());

        //problem.4
        rectangle rc=new rectangle();
        rc.a=3;
        rc.b=4;
        System.out.println("The area of square is: "+rc.area());
        System.out.println("The perimeter of square is: "+rc.perimeter());

        //problem.5
        Tommy play=new Tommy();
        play.hit();
        play.run();
        play.fire();

        //problem.6
        circle cr=new circle();
        cr.r=5;
        cr.area();
        cr.perimeter();







    }
}
