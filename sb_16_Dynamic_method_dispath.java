package com.company;

class Phone{
    public void name(){
        System.out.println("I am a phone.");
    }
    public void ringing(){
        System.out.println("Phone is Ringing....");
    }
}
class SmartPhone extends Phone{
    @Override
    public void name(){
        System.out.println("I am a SmartPhone.");
    }
    public void music(){
        System.out.println("Play music...");
    }
}
public class sb_16_Dynamic_method_dispath {
    public static void main(String[] args) {
//        Phone ph=new Phone(); //This is allowed
//        SmartPhone sp =new SmartPhone(); //This is allowed
//        SmartPhone sp1=new Phone(); //This is not allowed
        Phone ph1 = new SmartPhone();//This is allowed --> that is called dynamic method dispatch
        ph1.ringing(); //This is allowed --> This is call (ringing method) of (class Phone{})
        ph1.name(); //This is allowed --> This is call (name method) of (class SmartPhone{})
      //  ph1.music(); //This is not allowed --> because there are no method in << class Phone{} >> with the name << music() >>


    }
}
