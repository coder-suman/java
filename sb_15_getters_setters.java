package com.company;

class Myemployee{
    private int id;
    private String name;

    public void set_id(int n){ //this is a setter
        id=n;
    }
    public void set_name(String name1){ //This is a setter
        name=name1;
    }
    public int get_id(){ //This is a getter
        return id;
    }
    public String get_name(){ //This is a getter
        return name;
    }
}
public class sb_15_getters_setters {
    public static void main(String[] args) {
        Myemployee suman=new Myemployee();
//        suman.id=45;
//        suman.name="Coder-suman"; These are throw an error due to private modifier.
        
        suman.set_id(45); //this is use for set id
        suman.set_name("Coder-suman"); //This is use for set name.

        System.out.println("The id is: "+suman.get_id());  //This is use for get id.
        System.out.println("The name is: "+suman.get_name()); //This is use for get name.

    }
}
