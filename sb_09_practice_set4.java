package com.company;
import java.util.Scanner;

public class sb_09_practice_set4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        problem.1
        int a = 10;
        if (a==11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }

//        problem.2
        System.out.print("Enter the number of physics: ");
        float num=sc.nextFloat();
        System.out.print("Enter the number of physics: ");
        float num2=sc.nextFloat();
        System.out.print("Enter the number of physics: ");
        float num3=sc.nextFloat();

        float total=(num+num2+num3);
        float per=(total*100)/300;
        System.out.println("The percentage of three nnumber is: "+per);

        if (per>40 && num>33 && num2>33 && num3>33){
            System.out.println("You are promoted.");
        }
        else{
            System.out.println("You are failed.");
        }

//        problem.3
        System.out.print("Enter the income in anm: ");
        float income=sc.nextFloat();
        float tax=0;

        if (income<2.5){
            tax=tax+0;
            System.out.println("Your amount of tax is: "+tax);
        }
        else if(income>=2.5 && income<=5.0){
            tax=(income-2.5f)*0.05f;
            System.out.println("Your amount of tax is: "+tax);
        }
        else if(income>5.0 && income<=10.0){
            tax=(income-2.5f)*0.05f;
            tax=(income-tax)*0.20f;
            System.out.println("Your amount of tax is: "+tax);

        }
        else if(income>10.0){
            tax=(income-2.5f)*0.05f;
            tax=(income-tax)*0.20f;
            tax=(income-tax)*0.30f;
            System.out.println("Your amount of tax is: "+tax);

        }

//        problem.4
        System.out.print("Enter the number(1 to 7): ");
        int num4=sc.nextInt();

        switch (num4) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");


        }

//        problem.5
        System.out.print("Enter the year which you want to check: ");
        int year = sc.nextInt();
        int x =year%4;
        int b =year%400;

        if (x==0 || b==0){
            System.out.println("The "+year+" is a lipyear.");
        }

        else{
            System.out.println("The "+year+" is not a lipyear.");
        }

//        problem.6
        System.out.println("Enter the link: ");
        String link=sc.next();

        if (link.endsWith(".com")){
            System.out.println("This is a commertial website.");
        }
        else if(link.endsWith(".org")){
            System.out.println("This is an organization website.");
        }
        else if(link.endsWith(".in")){
            System.out.println("This is an indian website.");
        }



    }
}
