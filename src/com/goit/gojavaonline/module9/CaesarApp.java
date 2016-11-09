package com.goit.gojavaonline.module9;

public class CaesarApp {
    public static void main(String[] args) {
        CaesaCryptograph caesaCryptograph = new CaesaCryptograph(1, "abcde");
        String text = "xabcdez";
        String encryptedText = caesaCryptograph.encrypt(text);
        String decryptedText = caesaCryptograph.decrypt(encryptedText);
        System.out.println(text + "\n" + encryptedText + "\n" + decryptedText);


    }
}
