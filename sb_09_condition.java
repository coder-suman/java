package com.company;
import java.util.Scanner;

public class sb_09_condition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are eligeble for vote.");
        }
        else{
            System.out.println("You are not eligeble for vote.");
        }

        int number = 70;
        switch (number) {
            case 18 -> System.out.println("you are a not votter.");
            case 20 -> System.out.println("you are a votter.");
            case 30 -> System.out.println("you are experenced.");
            case 60 -> System.out.println("you are older.");
            case 70 -> System.out.println("you are grand older.");
        }
    }
}
