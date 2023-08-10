package com.company;

public class sb_13_method_over {
    //Method over_loding-->That means name of methods are same but their work is deference.
    static void foo(){
        System.out.println("Good Morning my friend.");
    }
    static void foo(int a){
        System.out.println("Good morning my friend "+a);
    }
    static void foo(int a,int b){
        System.out.println("Good Morning my friend "+a);
        System.out.println("Good Morning my friend "+b);
    }
    public static void main(String[] args) {
        foo(); //This is call foo(){}
        foo(20); //This is call foo(int a){}
        foo(30,40); //This is call foo(int a,int b){}

    }
}
