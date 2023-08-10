package com.company;
import java.util.Scanner;

public class sb_06_practice_set2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        problem.1
        float k = 7/4.0f * 9/2.0f;
        System.out.println(k);

//        problem.2
        char grade = 'B';
        //encrypt
        grade = (char)(grade+8);
        System.out.println(grade);

        //decrypt
        grade =(char) (grade-8);
        System.out.println(grade);

//        problem.3
        System.out.print("Enter the number: ");
        int y = sc.nextInt();
        int z = 10;
        System.out.println(z>y);

//        problem.4
        int v = 4;
        int u = 6;
        int a = 2;
        int s = 1;
        System.out.println((v*v-u*u)/(2*a*s));

//        problem.5
        int w = 7*49/7 + 35/7;
        System.out.println(w);

    }
}
