package com.company;

class A{
    public A(){
        System.out.println("I am an A class constructor.");
    }
    public void W(){
        System.out.println("I am an A class method.");
    }

}

class B extends A{
    public B(){
        System.out.println("I am a B class constructor.");

    }
    @Override //This is an override tag which is used for mark override.(this is recommended)
    public void W(){ //This is an override method of class A
        System.out.println("I am a B class method.");
    }
}
public class sb_16_overriding {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        System.out.println();
        //If there are exactly same name of method of a child class -> like a method of its parent class. Then that child class method is called override of the parent class method.
        a.W(); //here this is call -> public void W(){} which is in the -> class A{}
        b.W(); //here this is call an override method of -> class B{} >> public void W(){}

    }
}
