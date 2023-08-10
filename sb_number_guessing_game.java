package com.company;
import java.util.Scanner;
import java.util.Random;
class Game {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    private int no_of_guesses = 1;
    private int gen_number;

    public Game(int x, int y) {
        int g = rn.nextInt(x, y);
        gen_number = g;
    }
    public void takeuserinput() {
        System.out.print("Enter your number: ");
        int g = sc.nextInt();
        iscorrectnumber(g);
    }
    public void iscorrectnumber(int user_input) {
        if (gen_number == user_input) {
            System.out.println("Congratulation! You got the number.");
            System.out.println("You guess the number in " + getNo_of_guesses() + " time.");
        } else if (user_input > gen_number) {
            System.out.println("You choose a greater number than computer.");
            no_of_guesses += 1;
            takeuserinput();
        } else if (user_input < gen_number) {
            System.out.println("You choose a smaller number than computer.");
            no_of_guesses += 1;
            takeuserinput();
        }
    }
    public int getNo_of_guesses() {
        return no_of_guesses;
    }
}

class start {
    Scanner sc = new Scanner(System.in);
    public int chooselevel() {
        System.out.println("1-->EASY");
        System.out.println("2-->MEDIUM");
        System.out.println("3-->HARD");
        System.out.println("Enter your level: ");
        int k = sc.nextInt();
        int q = 0;
        switch (k) {
            case 1 -> {q = 30;System.out.println("Choose the number (between 0-30)");}
            case 2 -> {q = 60;System.out.println("Choose the number (between 0-60)");}
            case 3 -> {q = 100;System.out.println("Choose the number (between 0-100)");}
        }
        return q;
    }
}

public class sb_number_guessing_game {
    public static void main(String[] args) {
        start st=new start();
        int z=st.chooselevel();
        int g=0;

        Game gm=new Game(g,z);
        gm.takeuserinput();

    }
}
