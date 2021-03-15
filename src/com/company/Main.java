package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int lifeCount = 8; // LIFECOUNTER WHEN IT FALLS TO ZERO GAME OVER



        GameStart.welcomeMsg(); //SIMPLE GAME MSG
        String randomWord  = GameBody.wordSelector();
        char[] placeHolder = new char [randomWord.length()]; // CONTAINS "XXX" TO REVEAL LETTERS FROM WORD REVEAL

        for (int i = 0 ; i < randomWord.length(); i++){

            placeHolder[i] = '_'; // POPULATES THE PLACEHOLDER WITH XXX'S TO BE REVEALED ON CORRECT GUESS
        }





        while(lifeCount > 0) {
            char[] wordreveal  = randomWord.toCharArray(); // TURNS STRING INTO CHAR ARRAY FOR USE

            char verify = GameBody.letterVerif(randomWord); // RETURNS LETTER



            if(verify != 'x'){

                int placeHolderLocal = new String(wordreveal).indexOf(verify);// GET THE LOCATION OF THE CORRECT LETTER

                for(int k = 0 ; k < wordreveal.length; k++ )
                {
                    if(placeHolder[placeHolderLocal] == '_'){
                        placeHolder[placeHolderLocal] = verify;
                        System.out.println(placeHolder);

                    }
                }
            }
            else {
                lifeCount = lifeCount - 1 ;
                System.out.println(lifeCount);

            }



        }






    }



}
