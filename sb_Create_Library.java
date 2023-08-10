package com.company;

import java.util.Scanner;
class Library{
    Scanner sc=new Scanner(System.in);
    String []available_books;
    int number_of_book;
    public Library(){
        this.available_books=new String[100];
        this.number_of_book=0;
    }

    public void addBook(String book){
        this.available_books[number_of_book]=book;
        number_of_book++;
        System.out.println("Succesfully add.--> "+book);
    }
    public void Show_available_book(){
        System.out.println("Available books are: ");
        for(int i=0;i<available_books.length;i++){
            String bname=available_books[i];
            if(bname==null){
                continue;
            }else{
                System.out.println("* "+bname);
            }
        }
    }

    public void issueBook(String name){
        for(int i=0;i<available_books.length;i++){
            if(available_books[i]==null){
                continue;
            }
            else if(available_books[i].equals(name)){
                System.out.println(name+" --> is successfully issued");
                available_books[i]=null;
                return;
            }
        }

        System.out.println(name+" --> is not available.");

    }
    public void returnBook(String name3){
        addBook(name3);

    }
    public String take_name_book(){
        System.out.println("Enter the name of book: ");
        String name=sc.next();
        return name;
    }
    public int whatyouwant(){
        System.out.println("\n");
        System.out.println("1-->AddBook");
        System.out.println("2-->IssueBook");
        System.out.println("3-->ReturnBook");
        System.out.println("4-->Available Book");
        System.out.println("5-->Exit");
        System.out.print("What you want to do?:(1/2/3/4/5) ");
        int a=sc.nextInt();
        if (a==1){
            String h=take_name_book();
            addBook(h);
        } else if (a==2){
            String a1=take_name_book();
            issueBook(a1);
        } else if (a==3) {
            String a4=take_name_book();
            returnBook(a4);
        } else if (a==4) {
            Show_available_book();
        } else if (a==5) {
            System.out.println("Thank You!");
            return 5;
        } else {
            System.out.println("You enter the wrong keyword,Please enter (1/2/3/4/5): ");
            whatyouwant();
        }
        return 1;

    }
}
public class sb_Create_Library {
    public static void main(String[] args){
        Library li=new Library();
        int g=0;
        while(g!=5) {
            g=li.whatyouwant();

        }
    }

}
