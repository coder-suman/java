package com.company;
import java.util.Scanner;  //import for read

public class sb_03_taking_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //sc is sort from of Scanner because we use it easily.
        //system.in use for read the value

        System.out.print("Enter the number1: ");
        int a = sc.nextInt();  //sc.nextInt use for taking input on runtime.

        System.out.print("Enter the number2: ");  //use println for new line and print use for one line.
        int b =sc.nextInt();

        int sum=a+b;

        System.out.print("The sum of number is: ");
        System.out.println(sum);

    }
}
