package com.company;
//create my own class:
class employee1{
    int id;
    String name;
    int salary=30000;

    //Create method under Employee:
    public void details(){
        System.out.println("The id is: "+id);
        System.out.println("The name is: "+name);
    }
    public void get_salary(){
        System.out.println("The salary of "+name+" is: "+salary);
    }
}

public class sb_14_oops1 {
    public static void main(String[] args) {
        employee1 suman=new employee1(); // create object 1
        employee1 sayan=new employee1(); //create object 2

        //create attribute
        suman.id=5;
        suman.name="Suman Bajani";
        suman.salary=50000;

        sayan.id=6;
        sayan.name="Sayan Bajani";

        //print the attribute:
        System.out.println(suman.id);
        System.out.println(suman.name);

        //print the attribute call the method
        suman.details();
        suman.get_salary();
        System.out.println();
        sayan.details();
        sayan.get_salary();


    }
}
