package com.goit.gojavaonline.module9;

public class CaesarApp {
    public static void main(String[] args) {
        String text = "Это алгоритм Цезаря";
        String cipher = CaesarCryptoUtils.encript(text, 5);
        String decrypted = CaesarCryptoUtils.decript(cipher, 5);
        System.out.println(text + "\n" + cipher + "\n" + decrypted);

    }
}
