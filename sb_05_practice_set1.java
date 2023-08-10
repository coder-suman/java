package com.company;
import java.util.Scanner;

public class sb_05_practice_set1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question.1
        System.out.print("Enter the first number: ");
        float a = sc.nextInt();

        System.out.print("Enter the second number: ");
        float b = sc.nextInt();

        System.out.print("Enter the third number: ");
        float c = sc.nextInt();

        float sum = a+b+c;
        System.out.print("the sum is: ");
        System.out.println(sum);

//        question.2
        System.out.print("Enter the subject1 number: ");
        float d = sc.nextFloat();

        System.out.print("Enter the subject2 number: ");
        float e = sc.nextFloat();

        System.out.print("Enter the subject3 number: ");
        float f = sc.nextFloat();

        float cgpa = (d+e+f)/30;
        System.out.print("CGPA is "+ cgpa);


//        Question.3
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Hello "+ name + " have a good day!");

//        Question.4
        System.out.print("Enter distance in (km): ");
        float x = sc.nextFloat();
        float mile = x*0.621371f;
        System.out.println("Distance in mile is: "+ mile);

//        Question.5
        System.out.println("Enter the number: ");

        System.out.println(sc.hasNextInt());






    }
}
