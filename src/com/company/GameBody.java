package com.company;

import java.util.Random;
import java.util.Scanner;

public class GameBody {

    //SELECTS A RANDOM WORD FROM THE ARRAY

    public static String wordSelector() {

        String[] words = {"XXXX"};

        return words[new Random().nextInt(words.length)];
    }


    //TAKES THE WORD FROM WORD SELECTOR() AND TAKES USER INPUT AND CHECKS IT AGAINST THE WORD

    static char letterVerif(String chosenWord)// RETURNS A CORRECTLY CHOSEN LETTER ,RETURN CHAR 'X' IF INCORRECT
    {
        char[] letterSplit = chosenWord.toCharArray(); //CREATES THE CHAR ARRAY
        Scanner userIn = new Scanner(System.in); //SCANNER OBJ

        System.out.println("Please select a letter");
        char userInput = userIn.next().charAt(0);// FIRST CHAR OF THE USER INPUT TAKEN


        userInput = Character.toUpperCase(userInput);// TURNS USER INPUT TO UPPER CASE

        char result = 'x';

        // CHECKS IF LETTER IS IN WORD
        for (char c : letterSplit) {
            if (userInput == c) {
                result = c;
            }
        }

        userInput = result;
        return userInput;
    }
}