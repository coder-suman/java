package com.company;

public class sb_07_string_method {
    public static void main(String[] args) {
        String name = "Suman";

//        to get the length of string--> .length()
        System.out.println(name.length());

//        to print all character of string in lowercase(small letter)--> .toLowerCase()
        System.out.println(name.toLowerCase());

//        to print all character of string in uppercase(capital letter)--> .toUpperCase()
        System.out.println(name.toUpperCase());

//        to remove space into string--> .trim()
        String name2 = "   sayan   ";
        System.out.println(name2.trim());

//        to get substring from an entire string--> .substring()
        System.out.println(name.substring(2)); //here string is count from index-2 to end of the string
        System.out.println(name.substring(1,3)); //here string is count from index-1 to previous index of 3

//        to replace the letter of string--> .replace()
        System.out.println(name.replace("a","o")); //here 'a' is replace by 'o' "suman-->sumon"
        System.out.println(name.replace("man","nan"));

//        return true if name start with the substring else return false--> .startsWith()
        System.out.println(name.startsWith("Su")); //return true
        System.out.println(name.startsWith("ma")); //return false

//        return true if name end with the substring else return false-->endsWith()
        System.out.println(name.endsWith("an")); //return true
        System.out.println(name.endsWith("su")); //return false

//        to find the character of the enter index number--> .charAt()
        System.out.println(name.charAt(3)); // here index-3 of suman is a
        System.out.println(name.charAt(1)); //here index-1 of suman is u

//        return the index of enter charecter
        System.out.println(name.indexOf("S")); //index of 'S' is-->0
        System.out.println(name.indexOf("n")); //index of 'n' is-->4
        System.out.println(name.indexOf("S",3)); //here start searching from index-3 to end,in this case 'S' is not avalavl so it return -1
        System.out.println(name.indexOf("n",3)); //here 'n' is presented into the index-3 to end

//        to search character from the last
        String name3="Harry";
        System.out.println(name3.lastIndexOf('r')); //here search character 'r' from the last character of "Harry" which is index-3
        System.out.println(name3.lastIndexOf('r',2)); //here search 'r' from the index-2 to index-0

//        to check equal or not
        System.out.println(name.equals("Suman")); // return true because it is equal with name
        System.out.println(name.equals("suman")); // return false because it is not equal(here 's' of suman is lower case)

//        it is use for ignor any case
        System.out.println(name.equalsIgnoreCase("sUmAn")); //return true(here only check the spelling of word)



    }
}
