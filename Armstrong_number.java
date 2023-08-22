package com.company;
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Armstrong Number---
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int result=0;
        int length;
        length=String.valueOf(n).length();
        int temp=n;
        int check=0;
        while (temp>0){
            int remainder=temp%10;
            check += (int) Math.pow(remainder,length);
            temp=Math.floorDiv(temp,10);
            if (check==n){
                result=1;
            }else{
                result=0;
            }
        }
        //System.out.println(result);

        //Final Output---
        if (result==1){
            System.out.println("The number is Armstrong.");
        }else{
            System.out.println("The number is not Armstrong.");
        }
    }
}
