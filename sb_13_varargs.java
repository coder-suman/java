package com.company;

public class sb_13_varargs {
    //varargs--> It is write with (int ...arg):This is create an array when we give many argument.
    static int sum(int b,int ...arr){ //int b is use for minimum 1-number is requerd.
        int result=b;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println("The sum of null is: "+sum());  //here this line occure an error because minimum one number requer.
        System.out.println("The sum of 1 is: "+sum(1));
        System.out.println("The sum of 2,4 is: "+sum(2,4));
        System.out.println("The sum of 2,4,5 is: "+sum(2,4,5));
        System.out.println("The sum of 2,4,5,6 is: "+sum(2,4,5,6));
        System.out.println("The sum of 2,4,5,6,7 is: "+sum(2,4,5,6,7));

    }
}
