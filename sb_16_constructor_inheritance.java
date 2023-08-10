package com.company;

class base{
    public base(){
        System.out.println("I am base class.");
    }
    public base(int a){
        System.out.println("I am base class with value a: "+a);
    }
}

class derived extends base{
    public derived(){
        System.out.println("I am derived class.");
    }
    public derived(int a,int b){
        super(a); //This is use for call the parent class constructor with one value (here: super(a); call -> public base(int b){} )
        System.out.println("I am derived class with value b: "+b);
    }
}

class childofderived extends derived{
    public childofderived(){
        System.out.println("I am child class of derived.");
    }
    public childofderived(int a,int b,int c){
        super(a,b); //This is use for the call parent class constructor with two value (here: super(a,b) call -> public derived(int a,int b){} )
        System.out.println("I am child class of derived with value c: "+c);
    }
}
public class sb_16_constructor_inheritance {
    public static void main(String[] args) {
        base b=new base();//this is call only the (class base{} --> constructor with no value)
        System.out.println();

        derived dr=new derived();//this is call the (class derived extends base{} --> constructor with no value)
                                    //here for inheritance : first execute base class constructor >> then execute derived class constructor.
        System.out.println();

        childofderived cd=new childofderived(); // this is call the (class childofderived extends derived{} --> constructor with no value)
        //here for inheritance >> first execute base class constructor >> then execute derived class constructor >> then execute childofderived class constructor.
        System.out.println();

        childofderived cod =new childofderived(4,5,6); // this is call the (class childofderived extends derived{} --> constructor with three value (public childofderived(int a,int b,int c)
        //here for inheritance >> first execute base class constructor(public base(int a) >> then execute derived class constructor(public derived(int a,int b) >> then execute childofderived class constructor(public childofderived(int a,int b,int c).
    }
}
