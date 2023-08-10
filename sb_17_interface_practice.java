package com.company;

class MyCellphone{ //That is a normal parent class which is inheritance in MySmartphone(use extends keyword)
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
interface Camera{ //That is an interface class which is implement in MySmartphone(use implements keyword)

    void Takephoto();
    void Takesnap();
    void Recordvideo();
    void Recordin4k();
}
interface Music{ //That is an interface class which is implement in MySmartphone(use implements keyword)
    void Playmusic();
    void Stopmusic();
    String [] musiclist();
}
interface GPS{ //That is an interface class which is implement in MySmartphone(use implements keyword)
    void GPS_on();
    void GPS_off();
}
interface wifi{ //That is an interface class which is implement in MySmartphone(use implements keyword)
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

class MySmartphone extends MyCellphone implements Camera,Music,GPS,wifi{
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
public class sb_17_interface_practice {
    public static void main(String[] args) {
        MySmartphone ms=new MySmartphone();

        //Calling musiclist()
        String [] arr=ms.musiclist();
        for(String item:arr){
            System.out.println(item);
        }

        System.out.println();
        //calling networklist();
        String [] arr1=ms.Get_networklist();
        for(String name:arr1){
            System.out.println(name);
        }

        System.out.println();
        //calling connect_to_the_network();
        ms.connect_to_the_network();

        System.out.println();
        //Calling Extend class MyCellphone();
        ms.call_number(897209657);
        ms.pick_call();
        ms.Endcall();

        System.out.println();
        //calling implement method GPS();
        ms.GPS_on();
        ms.GPS_off();

        System.out.println();
        //Calling implement method camera();
        ms.Takephoto();
        ms.Takesnap();
        ms.Recordvideo();
        ms.Recordin4k();
    }
}
