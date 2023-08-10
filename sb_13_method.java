package com.company;


public class sb_13_method {
    static void change(int []arr){
        arr[0]=45;
    }
    //create method
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x-y;
        }
        else{
            z=x+y;
        }
        x=500;
        return z; //return final result in the (int c)
    }
    public static void main(String[] args) {
        sb_13_method obj=new sb_13_method();//create an object
        int a=10;
        int b=20;
//        int c=obj.logic(a,b); //call method create an object
        int c=logic(a,b); //call method to static
        System.out.println(c);

        int a1=12;
        int b1=10;
//        int c1=obj.logic(a1,b1); //call method create an object
        int c1=logic(a1,b1); //call method to static
        System.out.println(c1);

//        Type1-Changing an Integer
        int d=50;
        int e=10;
        int f=logic(d,e); //call method with value(here the value will not change)
        System.out.println(d);

//        Type2-Changing an array
        int []marks={20,60,23,81,97};
        System.out.println("the array is: "+marks[0]);
        change(marks); //call method with reference (here value will be change)
        System.out.println("The new array is: "+marks[0]);

    }
}
