package com.company;

class Mymainemployee{
    private int id;
    private String name;
    public Mymainemployee(){
        System.out.println("I am base methode.");
        id=55;
        name="Your-name-here";} //Constructor
    public Mymainemployee(String s){name=s;} //Constructor
    public Mymainemployee(String s,int d){
        new Mymainemployee(); // To call another constructor.
        System.out.println("hello I take 2 input.");
        id=d;
        name=s;} //Constructor

    public void set_id(int n){ //this is a setter
        id=n;
    } //For constructor setters is not use
    public void set_name(String name1){ //This is a setter
        name=name1;
    } //For constructor setters is not use
    public int get_id(){ //This is a getter
        return id;
    }
    public String get_name(){ //This is a getter
        return name;
    }
}

public class sb_15_constructor {
    public static void main(String[] args) {
        Mymainemployee suman=new Mymainemployee("sb",45); //Call the constructor
//        suman.set_id(45);
//        suman.set_name("Coder-suman");

        System.out.println(suman.get_id());
        System.out.println(suman.get_name());


    }
}
