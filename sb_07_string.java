package com.company;
import java.util.Scanner;

public class sb_07_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the name: ");
//        String name = sc.next(); //for print one word.
//        System.out.println("The name is "+name);

//use of string
        System.out.println("Enter a sentence: ");
        String sen = sc.nextLine(); //for print full sentence.
        System.out.println(sen);

//        use of printf and format
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the number: ");
        float b = sc.nextFloat();
        System.out.printf("the number of int is %d and the number of float is %f",a,b); //use of (printf) in java,it is like c programm
        System.out.format("the number of int is %d and the number of float is %f",a,b); //use of (format) in java,it is like printf


    }
}
