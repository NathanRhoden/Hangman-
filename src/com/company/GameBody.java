package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GameBody {

    //SELECTS A RANDOM WORD FROM THE ARRAY

    public static String wordSelector() { //CHOOSES WORD FROM TXT FILE USING BUFFERED READER


        String path = "C:/Users/Nathan/Desktop/Hangman/words.txt"; // HELP FROM @ALEX LEE
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) !=null)
            {
                String[] values = line.split("");

            }



        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line); // NOT CURRENTLY STORING DATA



        String[] words = {"pineapple"};


        return words[new Random().nextInt(words.length)].toUpperCase();
    }


    //TAKES THE WORD FROM WORD SELECTOR() AND TAKES USER INPUT AND CHECKS IT AGAINST THE WORD

    static char letterVerif(String chosenWord)// RETURNS A CORRECTLY CHOSEN LETTER ,RETURN CHAR 'X' IF INCORRECT
    {
        int wordLength = chosenWord.length();
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