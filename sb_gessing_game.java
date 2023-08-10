package com.company;
import java.util.Scanner;
import java.util.Random;

public class sb_gessing_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rn =new Random();
        int time=0;


        System.out.println("!NUMBER GUSSING GAME!\n");
        System.out.println("RULLS:- Here you guess a number from a given range,\nIf your number is matching with computer's guess then you win,\nelse,computer win the match.\n ");


        while (true) {
            System.out.println("To play--> Enter-1");
            System.out.println("To exit--> Enter-2");
            System.out.println("Enter your choice (1/2): ");
            int a =sc.nextInt();

            if (a == 1) {
                System.out.println("WELL-COME INTO THE GAME.");
                System.out.println("Let's Start the game!\n");
                System.out.println("CHOOSE THE LEVEL OF GAME.");
                System.out.println("EASY-->0 to 5");
                System.out.println("MEDIUM-->0 to 10");
                System.out.println("HARD-->0 to 20\n");
                System.out.println("Enter the level: ");
                String level=sc.next();
                level=level.toLowerCase();





                if(level.equalsIgnoreCase("easy")){
                    int b= rn.nextInt(0,5);
//                    System.out.println(b);
                    int i=0;
                    while (i<5){
                        System.out.println("Enter your gussing number(o to 5): ");
                        int c=sc.nextInt();
                        if(b==c){
//                            System.out.println("You win");
                            System.out.println("You won the match in "+time+" time.");
                            break;
                        }
                        else{
                            System.out.println("you loose!");
                            time+=1;
                            i++;
                            continue;
                        }
                    }


                }
                else if(level.equalsIgnoreCase("medium")){
                    int b= rn.nextInt(0,10);
                    int i=0;
                    while (i<=10){
                        System.out.println("Enter your gussing number(0 to 10): ");
                        int c=sc.nextInt();
                        if(b==c){
//                            System.out.println("You win");
                            System.out.println("You won the match in "+time+" time.");
                            break;
                        }
                        else{
                            System.out.println("you loose!");
                            time+=1;
                            i++;
                            continue;
                        }
                    }


                }
                else if (level.equalsIgnoreCase("hard")) {
                    int b= rn.nextInt(0,20);
                    int i=0;
                    while (i<=20){
                        System.out.println("Enter your gussing number(0 to 20): ");
                        int c=sc.nextInt();
                        if(b==c){
//                            System.out.println("You win");
                            System.out.println("You won the match in "+time+" time.");
                            break;
                        }
                        else{
                            System.out.println("you loose!");
                            time+=1;
                            i++;
                            continue;
                        }
                    }


                }






            } else if (a == 2) {
                System.out.println("Thanks for playing. Have a nice day!");
                break;

            } else {
                System.out.println("Please Enter a valid number-->(1-Start and 2-Exit)");
                continue;

            }
        }

    }
}
