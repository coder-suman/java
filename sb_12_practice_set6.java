package com.company;
import java.util.Scanner;

public class sb_12_practice_set6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//       problem.1
        /*float []arr={12.5f,26.45f,60.45f,80.23f,10.5f};
        float sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of array is: "+sum);

//        problem.2
        int []arr={101,102,103,104,105,106};
        int present=100;
        boolean ispresent=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==present){
                ispresent=true;
                break;
            }
            else{
                continue;
            }

        }
        if (ispresent){
            System.out.println("The number is present in the array.");
        }
        else{
            System.out.println("The number is not present in the array.");
        }

//        problem.3
        float []marks={80.5f,75.0f,89.5f,76.0f,90.5f};
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        System.out.println("The avarage is: "+sum/marks.length);

//        problem.4
        int [][]matrix1={{2,4,6},
                        {6,1,3}};
        int [][]matrix2={{1,8,6},
                        {3,7,0}};
        int [][]sum={{0,0,0},
                    {0,0,0}};
        for(int i=0;i< matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

//        problem.5
        //type1-reverse for loop
        int []array={1,2,3,4,5,6,7};
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]);
            System.out.print(" ");
        }

        //Type2-swap method
        int []array={2,8,9,4,5,3,6,1};
        int temp;
        int l=array.length;
        int a=Math.floorDiv(l, 2);
        for(int i=0;i<a;i++){
            temp=array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp;
        }
        for(int i=0;i<l;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }

//        problem.6
        int []array={21,8,9,20,5,3,6,31};
        int b=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if(array[i]>b){
                b=array[i];
            }
        }
        System.out.println("max is "+b);

//        problem.7
        int []array={0,8,9,4,10,3,6,1};
        int b=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if (array[i]<b) {
                b=array[i];
            }
        }
        System.out.println("min is "+b);*/

//        problem.8
        int []array={6,5,4,3,2,1};
        boolean is_sorted=false;
        for(int i=0;i<array.length-1;i++) {
                if (array[i]>array[i+1]){
                    is_sorted=true;
                }
                else{
                    is_sorted=false;
                }
            }
        if (is_sorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }

        //Sort an array(Bubble sort):
        /*System.out.print("Enter the number of element: ");
        int a=sc.nextInt();
        int []array=new int[a];
        for (int i=0;i<array.length;i++){
            System.out.print("Enter the element of array: ");
            array[i]=sc.nextInt();
        }
        System.out.println("The unsorted array is: ");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]);
            System.out.print(" ");

        }
        System.out.println("\n");
        int temp=0;
        for(int i =0;i<array.length;i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp=array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");


        }*/

    }

}
