package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String word1 = "Same";
        String word2 = "Saam";
        String word = "power";
        String ogword = "hummus";
        String newword = "";
        int firstNum = 10;
        int secondNum = 10;


        isEven(1);
        sameSpelling(word1, word2);
        notW(word);
        randomNumber();
        newWord(ogword, newword);
        listNumbers(7);
        numberCheck(firstNum, secondNum);
        countryAbbrev();
        whichLetter();

    }

    //Problem 1
    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

//Problem2

    public static boolean sameSpelling(String word1, String word2) {
        if (word1.equals(word2)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

//Problem3

    public static void notW(String word) {

        char[] stringToCharArray = word.toCharArray();
        for (char output : stringToCharArray) {
            if (output == 'w' || output == 'W') {
                break;
            } else {
                System.out.println(output);
            }
        }

    }

    //Problem4
    public static int randomNumber() {
        int random = (int) (Math.random() * 100);
        System.out.println(random);

        if (random == 50) {
            System.out.println(50);
            return 50;
        } else {
            System.out.println(random);
            return -1;
        }
    }
//Problem5


    //Problem6      ... stringname.charAt()
    public static String newWord(String ogword, String newword) {

        for (int i = 0; i < ogword.length(); i += 2) {
            newword = newword + ogword.charAt(i);
        }
        System.out.println(newword);
        return newword;
    }


    //Problem7
    public static void listNumbers(int number) {

        int i = 0;
        while (i < number) {
            i += 1;
            if (i != 4) {
                System.out.println(i);
            }

        }
    }

    //Problem8
    public static int numberCheck(int firstNum, int secondNum) {


        if (firstNum == secondNum) {
            int sum = (firstNum + 2) + (secondNum + 2);
            System.out.println(sum);
            return sum;

        } else {
            int sum = (firstNum + 1) + (secondNum + 1);
            System.out.println(sum);
            return sum;

        }
    }

    //Problem9
    public static void countryAbbrev() {

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String userString = userInput.toLowerCase();

        switch (userString) {
            case("us"):
                System.out.println("United States");
                break;
            case("de"):
                System.out.println("Germany");
                break;
            case("hu"):
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    //Problem10
    public static void whichLetter() {

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String userString = userInput.toLowerCase();

        switch (userString) {
            case("a"):
                System.out.println("is a vowel");
                break;
            case("e"):
                System.out.println("is a vowel");
                break;
            case("i"):
                System.out.println("is a vowel");
                break;
            case("o"):
                System.out.println("is a vowel");
                break;
            case("u"):
                System.out.println("is a vowel");
                break;
            default:
                System.out.println("is a consonant");
        }
    }
}