package com.company;
import java.util.Scanner;

public class sb_12_array_in_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        There are three ways to create an array
        //number1-Declaration and then memory allocation
        /*  int []array; //Declaration
        array=new int[5]; //(memory allocation) here 5 is size of array
        array[0]=12;
        array[1]=13;
        array[2]=15;
        array[3]=16;
        array[4]=19;
        System.out.println(array[2]);

        //number2-Declaration and memory allocation
        int []marks=new int[5];
        marks[0]=12;
        marks[1]=13;
        marks[2]=15;
        marks[3]=16;
        marks[4]=19;
        System.out.println(marks[3]);

        //number3-Declare and initialize
        int[]arr={12,13,15,16,19};
        System.out.println(arr[4]);

//        DISPLAY AN ARRAY
//        There are three ways to display an array
        //Number1-simple way
        System.out.println("The simple way to display ann array:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //Number2-using for loop
        System.out.println("Display array using for loop:");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

        //NUmber3-Using For-each loop
        System.out.println("Display array using For-each loop:");
        for(int element:arr){
            System.out.println(element);
        }

        //Quick quiz display array in reverse
        System.out.println("Display array in reverse using for loop:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }


//        2-D ARRAY
//        How to display 2-D array
//        Type-1
        int [][]flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println(flats[1][1]);

//        Type-2
        int [][]marks={{101,102,103},{201,202,203}};
        System.out.println(marks[1][1]);

        //display 2-D array using for loop
        for(int i=0;i< marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Create an 2-D array taking user input
        System.out.print("Enter the number of rows: ");
        int a=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int b=sc.nextInt();
        int [][]array=new int[a][b];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.printf("Enter the element of array[%d][%d]: ",i,j);
                array[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //Create an 1-D array taking user input
        System.out.print("How meny input you want in the array: ");
        int a=sc.nextInt();
        int []marks=new int[a];
        for(int i=0;i<a;i++){
            System.out.print("Enter the element of array: ");
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]);
            System.out.print(" ");
        }*/

        //How to remove an element from array
        int h=0;
        String []arr={"one","two","three","four"};
        System.out.print("What you want to remove: ");
        String x=sc.next();

        for (int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(x)){
                h=i;
                arr[i]=null;
                break;
            }
        }
        for (int j=h;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        for (int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+",");
        }



    }
}
