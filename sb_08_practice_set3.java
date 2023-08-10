package com.company;

public class sb_08_practice_set3 {
    public static void main(String[] args) {

//        problem.1
        String name="SUMAN";
        name=name.toLowerCase();
        System.out.println(name);

//        problem.2
        String name2="Java code expart";
        name2 = name2.replace(' ','_');
        System.out.println(name2);

//        problem.3
        String letter = "Dear <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>","suman");
        System.out.println(letter);

//        problem.4
        String sen="My name  is suman";
        System.out.println(sen.indexOf("  "));
        System.out.println(sen.indexOf("   "));

//        problem.5
        String letter2="Dear Harry,\n\t This Java Course is nice.\n\tThanks";
        System.out.println(letter2);
    }
}
