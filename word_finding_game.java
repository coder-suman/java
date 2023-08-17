package com.company;
import java.util.Random;
import java.util.Scanner;

public class word_finding_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        String [][]arr1=new String[7][10];
        String []arr={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};


        int p=1;
        while (p<4) {
            System.out.println(">>LEVEL-->"+p+"<<");


            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 10; j++) {
                    int y = rn.nextInt(25);
                    arr1[i][j] = arr[y];

                }
            }
            switch (p) {
                case 1 -> {
                    System.out.println("Find all words: ");
                    System.out.println("CET,COLLAGE,DOOR,FREE,RIGHT");
                    System.out.println();

                    arr1[2][2] = "C";
                    arr1[3][3] = "E"; //THIS LINE SOME PROBLEM
                    arr1[4][4] = "T";

                    arr1[0][1] = "C";
                    arr1[0][2] = "O";
                    arr1[0][3] = "L";
                    arr1[0][4] = "L";
                    arr1[0][5] = "A";
                    arr1[0][6] = "G";
                    arr1[0][7] = "E";

                    arr1[5][5] = "D";
                    arr1[4][5] = "O";
                    arr1[3][5] = "O";
                    arr1[2][5] = "R";

                    arr1[5][1] = "F";
                    arr1[4][2] = "R";
                    arr1[3][3] = "E";
                    arr1[2][4] = "E";

                    arr1[5][6] = "R";
                    arr1[4][6] = "I";
                    arr1[3][6] = "G";
                    arr1[2][6] = "H";
                    arr1[1][6] = "T";
                }
                case 2 -> {
                    System.out.println("Find all words: ");
                    System.out.println("DEER,GOAT,WOMAN,BRAIN,CODE");
                    System.out.println();

                    arr1[5][4] = "D";
                    arr1[4][5] = "E";
                    arr1[3][6] = "E";
                    arr1[2][7] = "R";

                    arr1[1][1] = "G";
                    arr1[2][2] = "O";
                    arr1[3][3] = "A";
                    arr1[4][4] = "T";

                    arr1[0][3] = "W";
                    arr1[1][3] = "O";
                    arr1[2][3] = "M";
                    arr1[3][3] = "A";
                    arr1[4][3] = "N";

                    arr1[6][9] = "B";
                    arr1[6][8] = "R";
                    arr1[6][7] = "A";
                    arr1[6][6] = "I";
                    arr1[6][5] = "N";

                    arr1[2][9] = "C";
                    arr1[3][8] = "O";
                    arr1[4][7] = "D";
                    arr1[5][6] = "E";
                }
                case 3 -> {
                    System.out.println("Find all words: ");
                    System.out.println("HUNGRY,GOOD,MEMBER,YODY,ROOT,SON");
                    System.out.println();
                    arr1[6][7] = "H";
                    arr1[5][6] = "U";
                    arr1[4][5] = "N";
                    arr1[3][4] = "G";
                    arr1[2][3] = "R";
                    arr1[1][2] = "Y";

                    arr1[3][6] = "G";
                    arr1[2][7] = "0";
                    arr1[1][8] = "0";
                    arr1[0][9] = "D";

                    arr1[6][5] = "M";
                    arr1[6][4] = "E";
                    arr1[6][3] = "M";
                    arr1[6][2] = "B";
                    arr1[6][1] = "E";
                    arr1[6][0] = "R";

                    arr1[5][9] = "B"; //THIS LINE SOME PROBLEM
                    arr1[3][9] = "O";
                    arr1[4][9] = "D";
                    arr1[5][9] = "Y";

                    arr1[4][4] = "R";
                    arr1[4][3] = "O";
                    arr1[4][2] = "O";
                    arr1[4][1] = "T";

                    arr1[1][4] = "S";
                    arr1[1][5] = "O";
                    arr1[1][6] = "N";

                }
            }

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();

            }

            System.out.println();

            System.out.print("Do you find all words?(yes->1/no->2):");
            int r=sc.nextInt();
            System.out.println();
            if(r==1){
                p++;
            }else {
                continue;
            }

        }
        System.out.println("Congratulation! You complet all level.");
    }
}
