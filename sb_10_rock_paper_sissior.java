package com.company;
import java.util.Scanner;
import java.util.Random;

public class sb_10_rock_paper_sissior {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        int user=0;
        int computer=0;

        while(true) {
            //generate random number(1 to 3)
            int ran = rn.nextInt(1, 3);

            System.out.println("WellCome into The Rock,Paper,Scissor Game.");
            System.out.println("To Start the game please Enter-1 and For exit Enter-2.");
            int a = sc.nextInt();

            //enter into the game
            if (a == 1) {
                System.out.println("Let's Start the game.");
                System.out.println("1-ROCK,2-PAPER,3-SCISSOR");
                System.out.print("Enter your choice: ");
                int b = sc.nextInt();

                //user case
                switch (b) {
                    case 1 -> System.out.println("you choose: ROCK");
                    case 2 -> System.out.println("you choose: PAPER");
                    case 3 -> System.out.println("you choose: SCISSOR");
                }
                //computer case
                switch (ran) {
                    case 1 -> System.out.println("computer choose: ROCK");
                    case 2 -> System.out.println("computer choose: PAPER");
                    case 3 -> System.out.println("computer choose: SCISSOR");
                }
                if (b == 1 && ran == 3 || b == 2 && ran == 1 || b == 3 && ran == 2) {
                    System.out.println("You won.");
                    user+=1;
                }
                else if (b == ran) {
                    System.out.println("Match draw.");
                }
                else {
                    System.out.println("Computer won.");
                    computer+=1;
                }
                System.out.println( );//for space
            }
            //Exit from the game
            else if (a == 2) {
                System.out.println("Have a nice day!");
                break;
            } else {
                System.out.println("Please Enter (1 for Start or 2 for exit)");
                continue;
            }
        }
        System.out.println("Your score: "+user);
        System.out.println("Computer score: "+computer);


    }
}
