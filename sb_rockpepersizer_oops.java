package com.company;
import java.util.Random;
import java.util.Scanner;
class PlayGame{
    Random rn=new Random();
    Scanner sc=new Scanner(System.in);
    private int random;
    private int user_score=0;
    private int computer_score=0;
    public PlayGame(int a,int b){
        int x=rn.nextInt(a,b);
        this.random=x;
    }
    public int takeuserinput(){
        System.out.println("1-->ROCK");
        System.out.println("2-->PAPER");
        System.out.println("3-->SIZER");
        System.out.print("Enter your choice: ");
        int s= sc.nextInt();
        return s;
    }
    public int game_start(){
        int d=0;
        System.out.print("Yes/No)?: ");
        String enter=sc.next();
        if(enter.equalsIgnoreCase("yes")){
            System.out.println("Welcome into the game.");
            int f=takeuserinput();
            d=f;
        }
        else if(enter.equalsIgnoreCase("no")){
            System.out.println("Thanks for playing.");

        }
        else{
            System.out.println("please enter (yes/no).");
            game_start();
        }
        return d;
    }


    public void checkwin(int h){
        switch (h) {
            case 1 -> System.out.println("you choose: ROCK");
            case 2 -> System.out.println("you choose: PAPER");
            case 3 -> System.out.println("you choose: SCISSOR");
        }
        //computer case
        switch (random) {
            case 1 -> System.out.println("computer choose: ROCK");
            case 2 -> System.out.println("computer choose: PAPER");
            case 3 -> System.out.println("computer choose: SCISSOR");
        }
        if(h==1 & random==3 || h==2 & random==1 || h==3 & random==2){
            System.out.println("You win.");
            user_score+=1;
        }
        else{
            System.out.println("Computer win.");
            computer_score+=1;
        }
    }

    public void score(){
        System.out.printf("Your win: %d time.\n",user_score);
        System.out.printf("Computer win: %d time.",computer_score);
        System.out.println();
    }



}
public class sb_rockpepersizer_oops {
    public static void main(String[] args) {
        while (true) {

            PlayGame pg = new PlayGame(1, 3);
            System.out.println("Do you want to play game.");
            int y = pg.game_start();
            if(y==1 || y==2 || y==3){
                pg.checkwin(y);
                pg.score();

                System.out.println();
            }
            else{break;}


        }
    }
}
