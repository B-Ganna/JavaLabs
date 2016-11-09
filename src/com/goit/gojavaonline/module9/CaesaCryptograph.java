package com.goit.gojavaonline.module9;


public class CaesaCryptograph {
    private int key;
    private final String alphabet;

    public CaesaCryptograph(int key, String alphabet) {
        this.key = key;
        this.alphabet = alphabet;
    }

    private char encryptLetter(char letter, int key) {
        int letterIndex = alphabet.indexOf(letter);
        if (letterIndex != -1) {
            int shiftedLetterIndex = ((letterIndex + key) + alphabet.length()) % alphabet.length();
            return alphabet.charAt(shiftedLetterIndex);
        }
        return letter;
    }

    private String encryptString(String text, int key) {
        StringBuilder builder = new StringBuilder();
        char[] charText = text.toCharArray();
        for (char charLetter : charText) {
            builder.append(encryptLetter(charLetter, key));
        }
        return builder.toString();
    }

    public String encrypt(String text) {
        return encryptString(text, key);
    }

    public String decrypt(String text) {
        return encryptString(text, -key);
    }


}
