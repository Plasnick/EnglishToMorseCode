package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseTranslator {

    private Map<Character, String> morseMap = new HashMap<>(); // this property belongs to an object

    public static void main(String[] args) { // keyboard static means it belongs to the class

        MorseTranslator morseTranslator = new MorseTranslator(); // new installation, MorseTranslator
                                                                    // calls the constructor

        morseTranslator.makeMap(); // load the map with the key value pairs

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a phrase and I will convert to morse code for you: ");
        String phrase = scanner.nextLine();
        String convertedPhrase = convertToMorse(phrase, morseTranslator);
        System.out.println(convertedPhrase);




    }

    public static String convertToMorse(String phrase, MorseTranslator morseTranslator) {
        // create a variable to hold the answer
        String answer = "";
        // loop through the phrase
        phrase = phrase.toUpperCase();
        for (int i = 0; i < phrase.length(); i++) {

            // exception to work on: Character.isAlphabetic();

            char phraseChar = phrase.charAt(i);
            // convert each character
            // morseTranslator is the object to get to the property called morseMap
            // call the get method to return the value associated with the key
            String morseString = morseTranslator.morseMap.get(phraseChar);
            // add converted to the answer
            answer += morseString + " "; //put a string between each character
            // deal with spaces (NOT HAPPY PATH)

        }
        return answer;
            // convert each character
            // del with spaces?
            // add converted to the answer
        // return the answer
    }

    public void makeMap() {

        morseMap.put('A', "*-");
        morseMap.put('B', "-***");
        morseMap.put('C', "-*-*");
        morseMap.put('D', "-**");
        morseMap.put('E', "*");
        morseMap.put('F', "**-*");
        morseMap.put('G', "--*");
        morseMap.put('H', "****");
        morseMap.put('I', "**");
        morseMap.put('J', "*---");
        morseMap.put('K', "-*-");
        morseMap.put('L', "*-**");
        morseMap.put('M', "--");
        morseMap.put('N', "-*");
        morseMap.put('O', "---");
        morseMap.put('P', "*--*");
        morseMap.put('Q', "--*-");
        morseMap.put('R', "*-*");
        morseMap.put('S', "***");
        morseMap.put('T', "-");
        morseMap.put('U', "**-");
        morseMap.put('V', "***-");
        morseMap.put('W', "*--");
        morseMap.put('X', "-**-");
        morseMap.put('Y', "_*__");
        morseMap.put('Z', "--**");
        morseMap.put(' ', "   ");

    }

}
