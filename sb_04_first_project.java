package com.company;
import java.util.Scanner;
public class sb_04_first_project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x=500;

        System.out.print("Enter the number of 1st subject: ");
        float a=sc.nextFloat();

        System.out.print("Enter the number of 2nd subject: ");
        float b=sc.nextFloat();

        System.out.print("Enter the number of 3rd subject: ");
        float c=sc.nextFloat();

        System.out.print("Enter the number of 4th subject: ");
        float d=sc.nextFloat();

        System.out.print("Enter the number of 5th subject: ");
        float e=sc.nextFloat();

        float total=a+b+c+d+e;
        System.out.print("Total number of all subject is: ");
        System.out.println(total);

        float per=(total*100)/x;
        System.out.print("The percentage of tatal number is: ");
        System.out.println(per);

    }
}
