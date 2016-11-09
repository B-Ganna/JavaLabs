package com.goit.gojavaonline.module9;

public class CaesarApp {
    public static void main(String[] args) {
        CaesarCryptograph caesarCryptograph = new CaesarCryptograph(1, "abcde");
        String text = "xabcdez";
        String encryptedText = caesarCryptograph.encrypt(text);
        String decryptedText = caesarCryptograph.decrypt(encryptedText);
        System.out.println(text + "\n" + encryptedText + "\n" + decryptedText);


    }
}
