package com.company;

//Abstract means --> Which is we think but it is not implement in physically or real.
abstract class parent{ //Abstract class
    public parent(){
        System.out.println("I am an abstract class constructor.");
    }
    public void wellcome(){
        System.out.println("Well come....");
    }
    abstract public void greet(); //That is an abstract method.(one abstract method make hole class abstract)
    abstract public void greet2(); //That is an abstract method.
}

// in abstract method we can't make any normal class, Either make override method of abstract method or make another abstract class.
class child2 extends parent{ // this is inheritance of abstract parent class
    @Override
    public void greet() {
        System.out.println("Good morning.");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon.");
    }
}
abstract class child3 extends parent{
    public child3(){
        System.out.println("I am a child3 constructor.");
    }
    abstract public void greet3();

}
class child4 extends child3{
    @Override
    public void greet3() {
        System.out.println("happy birthday.");
    }
    @Override
    public void greet() {
        System.out.println("WellCome my friend.");
    }

    @Override
    public void greet2() {
        System.out.println("Good by.");
    }
}
public class sb_17_Abstract {
    public static void main(String[] args) {
       // parent pr1=new parent(); -->error (cause this is an abstract class >> we can't make object of abstract class.)
       // child3 ch1=new child3(); -->error (cause this is an abstract class >> we can't make object of abstract class.)
       // parent pr1=new child2(); -->we can use this.
       // pr1.wellcome();
        child2 pr=new child2();
        pr.greet();
        pr.greet2();

        System.out.println();

        child4 ch4=new child4();
        ch4.greet();
        ch4.greet2();
        ch4.greet3();
    }
}
