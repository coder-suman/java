package com.company;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class Fountain_pen extends pen{
    public void write(){
        System.out.println("Writing...");
    }
    public void refill(){
        System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing the nib...");
    }
}
class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void speak(){
        System.out.println("Hello Sir.");
    }
}

abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting...");
    }
    public void disconnect(){
        System.out.println("Disconnect...");
    }
    public void see_number(){
        System.out.println("Seeing number...");
    }
    public void see_time(){
        System.out.println("See time...");
    }
}

interface TV_Remote{
    void power_on();
    void power_off();
    void change_chennel();
    void volume_up_down();
}
interface Smart_TV_Remote extends TV_Remote{
    void open_game();
    void open_youtube();
}
class TV implements Smart_TV_Remote{
    public void power_on(){
        System.out.println("power on...");
    }
    public void power_off(){
        System.out.println("Power off...");
    }
    public void change_chennel(){
        System.out.println("Change channel...");
    }
    public void volume_up_down(){
        System.out.println("Volume_up_down...");
    }
    public void open_game(){
        System.out.println("Game openinng...");
    }
    public void open_youtube(){
        System.out.println("Open youtube...");
    }
}
public class sb_17_practice_set11 {
    public static void main(String[] args) {

        //Problem.1 and 2
        Fountain_pen fp=new Fountain_pen();
        fp.refill();
        fp.changeNib();

        //problem.3
        Human hu=new Human();
        hu.eat();
        hu.speak();
        hu.jump();

        //problem.5
        Monkey m=new Human();
        m.bite();
        m.jump();
       // m.speak(); --> Error(deu to polymorphism)

        //problem.4
        Telephone tl=new SmartTelephone();
        tl.disconnect();
        tl.ring();
       // tl.see_time(); -->Error(deu to polymorphism)

        //problem.6 and 7
        TV t=new TV();
        t.power_on();
        t.change_chennel();
        t.open_game();
        t.power_off();
    }
}
