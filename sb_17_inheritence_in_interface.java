package com.company;

interface Parentclassinterface{
    void use1();
    void use2();
}
interface Childclassinterface extends Parentclassinterface{ //Here Parentclassinterface inheritence in Childclassinterface
    void use3();
    void use4();
}
class Useinterface implements Childclassinterface{ //In the implement --> all interface method must be use because Childclassinterfaceis extend of Parentclassinterface.
    public void use1(){
        System.out.println("Use1");
    }
    public void use2() {
        System.out.println("Use2");
    }
    public void use3(){
        System.out.println("Use3");
    }
    public void use4(){
        System.out.println("Use4");
    }
}
public class sb_17_inheritence_in_interface{
    public static void main(String[] args){
       Useinterface uf=new Useinterface();
       uf.use1();
       uf.use2();
       uf.use3();
       uf.use4();

    }
}
