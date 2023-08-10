package com.company;

public class sb_13_recursion {
    //Type -1:Rulls of fibonacci series(normal process)
    static void fibonacci(int a){
        int sum=0;
        int b=1;
        int c=0;
        System.out.print("The fibonacci number of "+a+" is: ");
        for (int i=0;i<=a;i++){
            System.out.print(sum);
            System.out.print(" ");
            c=b;
            b=sum;
            sum=b+c;

        }
        System.out.println(" ");

    }
    //Type-2: fibonacci series using recursion.
//    Rull:F(n)=F(n-1)+F(n-2) //here n=number
    static int fib_series(int k){
        if(k==0){
            return 0; //0th fibonacci is 0
        }
        if (k==1 || k==2){
            return 1; //1 and 2 fibonacci are 1
        }
        return fib_series(k-1)+fib_series(k-2); //here method call the same method that is called recurtion
    }

//    Rulls of factorial:
//    factorial of n=n*factorial(n-1)
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1); //here method call the same method that is called recursion.

        }
    }
    public static void main(String[] args) {
        //call factorial
        int x=4;
        System.out.printf("The factorial of %d is: %d",x,factorial(x));
        System.out.println(" ");

        //call fibonacci in normal process
        int f=4;
        int g=5;
        int h=6;
        fibonacci(f);
        fibonacci(g);
        fibonacci(h);

        //call fib_series in recursion process
        int y=4;
        for(int i=0;i<=y;i++){
            System.out.print(fib_series(i));
            System.out.print(" ");
        }


    }
}
