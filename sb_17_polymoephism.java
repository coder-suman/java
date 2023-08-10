package com.company;
//Polymorphism means when one things use as many things(Suppose a smartphone use like a camera,music_player,GPS,wifi etc)
//In the polymorphism when we use one interface That time we can't use any other Interface(suppose we use camera,That time we can't use GPS in the smartphone)
class MyCellphone2{ //That is a normal parent class which is inheritance in MySmartphone(use extends keyword)
    void call_number(int phonenumber){
        System.out.println("Calling..."+phonenumber);
    }
    void pick_call(){
        System.out.println("Connecting...");
    }
    void Endcall(){
        System.out.println("End Calling...");
    }
}
interface Camera2{ //That is an interface class which is implement in MySmartphone(use implements keyword)

    void Takephoto();
    void Takesnap();
    void Recordvideo();
    void Recordin4k();
}
interface Music2{ //That is an interface class which is implement in MySmartphone(use implements keyword)
    void Playmusic();
    void Stopmusic();
    String [] musiclist();
}
interface GPS2{ //That is an interface class which is implement in MySmartphone(use implements keyword)
    void GPS_on();
    void GPS_off();
}
interface wifi2{ //That is an interface class which is implement in MySmartphone(use implements keyword)
    private void search(){ //This method only pass through default method.
        System.out.println("Searching network...");
    }
    default void wifi_on(){ //in this method implement is not mandatory. ***Programmer also can implement this method if they want.
        System.out.println("wifi on...");
        search();//call private method.
    }
    String [] Get_networklist();
    void connect_to_the_network();
}

class MySmartphone2 extends MyCellphone2 implements Camera2,Music2,GPS2,wifi2{
    public void Takephoto(){
        System.out.println("Taking Photo...");
    }
    public void Takesnap(){
        System.out.println("Taking Snap...");
    }
    public void Recordvideo(){
        System.out.println("Recording video...");
    }
    public void Recordin4k(){
        System.out.println("Recording in 4k...");
    }
    public void Playmusic(){
        System.out.println("Music Playing...");
    }
    public void Stopmusic(){
        System.out.println("Music Stop...");
    }
    public String [] musiclist(){
        System.out.println("Music list are: ");
        String [] song={"sanam re","Bisakto Manush","Hoini Alap"};
        return song;
    }
    public void GPS_on(){
        System.out.println("GPS on...");
    }
    public void GPS_off(){
        System.out.println("GPS off...");
    }
    public String [] Get_networklist(){
        wifi_on();
//        System.out.println("Searching network...");
        String [] network={"Suman","Sayan","Kuntal","Manish"};
        return network;
    }
    public void connect_to_the_network(){
        wifi_on();
        System.out.println("Connect to the network...");
    }

}
public class sb_17_polymoephism {
    public static void main(String[] args) {
        //If we want to use camera in the smartphone ---
        Camera2 c2=new MySmartphone2(); //Here we use smartphone as a camera.(only camera's all method run successfully)
       // c2.GPS_on(); -->not valid(cause GPS_on method can't not resolve in the camera)
       // c2.call_number(); -->not valid(cause this method can't resolve in the camera)
        c2.Recordvideo();
        c2.Takephoto();

        System.out.println();

        //If we want to use whole Smartphone ---
        MySmartphone2 sm2=new MySmartphone2();
        sm2.GPS_on();
        sm2.call_number(5461);
        sm2.Playmusic();
        sm2.Recordvideo();
        sm2.Takephoto();

    }
}
