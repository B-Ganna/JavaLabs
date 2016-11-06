package com.goit.gojavaonline.module9;


public class CaesarCryptoUtils {
    private static final int LETTERS_IN_RUSSIAN_ALPHABET = 33;

    public static String encript(String plainText, int keyNumber) {
        if (keyNumber > LETTERS_IN_RUSSIAN_ALPHABET) {
            keyNumber = keyNumber % LETTERS_IN_RUSSIAN_ALPHABET;
        } else if (keyNumber < 0) {
            keyNumber = (keyNumber % LETTERS_IN_RUSSIAN_ALPHABET) + LETTERS_IN_RUSSIAN_ALPHABET;
        }

        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char letter = plainText.charAt(i);
            if (Character.isLetter(letter)) {
                if (Character.isLowerCase(letter)) {
                    char cipheredLetter = (char) (letter + keyNumber);
                    if (cipheredLetter > 'я') {
                        cipherText += (char) (letter - (LETTERS_IN_RUSSIAN_ALPHABET - keyNumber));
                    } else {
                        cipherText += cipheredLetter;
                    }
                } else if (Character.isUpperCase(letter)) {
                    char cipheredLetter = (char) (letter + keyNumber);
                    if (cipheredLetter > 'Я') {
                        cipherText += (char) (letter - (LETTERS_IN_RUSSIAN_ALPHABET - keyNumber));
                    } else {
                        cipherText += cipheredLetter;
                    }
                }

            } else {
                cipherText += letter;
            }

        }
        return cipherText;
    }

    public static String decript(String plainText, int keyNumber) {
        if (keyNumber > LETTERS_IN_RUSSIAN_ALPHABET) {
            keyNumber = keyNumber % LETTERS_IN_RUSSIAN_ALPHABET;
        } else if (keyNumber < 0) {
            keyNumber = (keyNumber % LETTERS_IN_RUSSIAN_ALPHABET) + LETTERS_IN_RUSSIAN_ALPHABET;
        }

        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char letter = plainText.charAt(i);
            if (Character.isLetter(letter)) {
                if (Character.isLowerCase(letter)) {
                    char cipheredLetter = (char) (letter - keyNumber);
                    if (cipheredLetter < 'а') {
                        cipherText += (char) (letter + (LETTERS_IN_RUSSIAN_ALPHABET - keyNumber));
                    } else {
                        cipherText += cipheredLetter;
                    }
                } else if (Character.isUpperCase(letter)) {
                    char cipheredLetter = (char) (letter - keyNumber);
                    if (cipheredLetter < 'А') {
                        cipherText += (char) (letter + (LETTERS_IN_RUSSIAN_ALPHABET - keyNumber));
                    } else {
                        cipherText += cipheredLetter;
                    }
                }

            } else {
                cipherText += letter;
            }

        }
        return cipherText;
    }
}
