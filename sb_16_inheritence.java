package com.company;

class Animal{ //that is base class.

    public void describe(){
        System.out.println("The animal is carnivores");
    }
    public void what_eat(){
        System.out.println("The animal eat meat.");
    }
}
class Dog extends Animal{  //that is inheritance(derived class),here we use class Animal{} without write whole method and attribute.
    // In the inheritance we use extends to copy the base class(class Animal)
    String name;
    public void is_pet(){
        System.out.println("Dog is use for pet.");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class sb_16_inheritence {
    public static void main(String[] args) {

        //call class Animal:
        Animal an=new Animal();
        an.describe();
        an.what_eat();

        System.out.println();

        //call class Dog ->which is derived from class Animal:
        Dog dg=new Dog();
        dg.setName("Tomy");
        dg.is_pet();
        System.out.println("The name of dog is: "+dg.getName());
        dg.what_eat(); //here we use (class Animal{} method) which is called by (class Dog{} object->dg)
        dg.describe(); //here we use (class Animal{} method) which is called by (class Dog{} object->dg)
    }
}
