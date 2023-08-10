package com.company;

import org.w3c.dom.ls.LSOutput;

//In the interface: If a new sub-class derive from the parent class then there use implements insteed of extends.
//Here all method of the interface class is must be used in the implement class.Unless its through error.
interface Bicycle{ //Interface-1
    int a=45; //We can create properties
    void applybreak(int decrement);
    void speedup(int increment);
//    void sound(int volumn); -->This is through an error.(cause:that is not implement in the Avoncycle class)
}
interface horn{ //Interface-2
    void blowbell();
    void blowring();

}
class Avoncycle implements Bicycle,horn{ //We can use two or more interfaces at one time.
    int speed=7;
    @Override
    public void applybreak(int decrement){
        speed=speed-decrement;
        System.out.println("Speed is decrement....");
        System.out.println("The current speed is "+speed);
    }
    @Override
    public void speedup(int increment){
        speed=speed+increment;
        System.out.println("Speed is increment....");
        System.out.println("The current speed is "+speed);
    }
    @Override
    public void blowbell(){
        System.out.println("crink crink.....");
    }

    @Override
    public void blowring() {
        System.out.println("pee pee pee.....");
    }

}
public class sb_17_interface {
    public static void main(String[] args) {
        Avoncycle av=new Avoncycle();
        System.out.println("Speed is: "+av.speed);
        av.applybreak(6);
        av.speedup(10);

        //We can create properties in the interface.
        System.out.println(av.a);

        //We can not modify that properties
        //av.a=456; -->Error

        av.blowbell();
        av.blowring();


    }
}
