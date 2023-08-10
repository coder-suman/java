package com.company;

public class sb_13_practice_set7 {
    static void table(int a){
        for (int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d \n",a,i,a*i);
        }
    }
    static void pattern1(int b){
        for (int i=0;i<b;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static int sum(int x){
        if (x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        else{
            return x+sum(x-1);
        }

    }
    static void pattern2(int y){
        for (int i=0;i<=y;i++){
            for (int j=y;j>i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static int fibonacci(int w){
        if (w==0 || w==1){
            return 0;
        }
        if (w==1 || w==2){
            return 1;
        }
        return fibonacci(w-1)+fibonacci(w-2);
    }

    static int avg(float ...m){
        int result=0;
        for(float element:m){
            result+=element;
        }
//        System.out.println(result);
        return (result/m.length);
    }

    static void pattern_rec1(int s){

        if (s>0) {
            pattern_rec1(s-1);
            for (int i = 0; i < s; i++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    static void pattern_rec2(int s){
        if (s>0){

            for(int i=s;i>0;i--){
                System.out.print("*"+" ");
            }
            System.out.println();
            pattern_rec2(s-1);
        }
    }

    static double fahrenheit(float v){
        float ans;
        ans=(v*9/5)+32;
        return ans;
    }

    static int sum1(int g){
        int sum2=0;
        for (int i=0;i<=g;i++){
            sum2+=i;
        }
        return sum2;
    }
    public static void main(String[] args) {
//        problem.1
        int c=5;
        table(c);

//        problem.2
        pattern1(4);

//        problem.3
        System.out.println("The sum of n natural number: "+sum(3));

//        problem.4
        pattern2(4);

//        problem.5
        int num=4;
        for (int i=1;i<=num;i++){
            System.out.print(fibonacci(i)+" ");
        }

//        problem.6
        float r=avg(1,2,3,4,5,6,7,8,9,10);
        System.out.println();
        System.out.println("The average of number is: "+r);

//        problem.7
        pattern_rec1(4);

//        problem.8
        System.out.println(" ");
        pattern_rec2(4);


//        problem.9
        int celsius=8;
        System.out.printf("%d degree C= %f degree F",celsius,fahrenheit(celsius));

//        problem.10
        System.out.println();
        int num2=3;
        System.out.printf("The sum of first %d natural number is: %d",num2,sum1(num2));





    }
}
