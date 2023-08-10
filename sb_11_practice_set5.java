package com.company;

public class sb_11_practice_set5 {
    public static void main(String[] args) {

//        problem.1
        int n=4;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }

//        problem.2
        int a=5;
        int i =0; //0,2,4,6,8 are the first n even number
        int sum = 0;
        while (i<a){
            sum +=2*i;
            i++;
        }
        System.out.println("The sum of first n even number: "+sum);

//        problem.3
        int x = 5;

        for (int j =1;j<=10;j++){
            int k = x*j;
            System.out.printf("%d X %d = %d\n",x,j,k);

        }

//        problem.4
        int b=10;
        for(i=b;i>=1;i--){
            int w = b*i;
            System.out.printf("%d X %d = %d\n",b,i,w);
        }

//        problem.5
        int d=5;
        int fact=1;
        for (i=d;i>=1;i--){
            fact*=i;
        }
        System.out.printf("Factorial of %d is: %d",d,fact);
        System.out.println("\n");

//        problem.6
        int num = 6;
        int fac=1;
        int s =1;
        while (s<=num){
            fac*=s;
            s++;
        }
        System.out.printf("Factorial of %d is: %d",num,fac);
        System.out.println("\n");

//        problem.7 (INCOMPLET)
//        ****
//        ***
//        **
//        *
        int q=4;
        int h=0;
        while(q>0){
            while(h<q){
                System.out.print("*");
                h++;
            }
            System.out.print("\n");
            q--;
        }

//        problem.8
//        ans=True

//        problem.9
        int t = 8;
        int total=0;

        for (int j =1;j<=10;j++) {
            int k = t * j;
            total+=k;
        }
        System.out.printf("The sum of table 8 is %d",total);
        System.out.println("\n");

//        problem.10
//        Ans=at least one

//        problem.11
        int num2=5;
        int sum1=0;
        for(int w=0;w<num2;w++){
            sum1+=(w*2);
        }
        System.out.printf("The sum of first n even number is %d.",sum1);


    }
}
