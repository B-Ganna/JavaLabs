package com.goit.gojavaonline.module9;

public class CaesarApp {
    public static void main(String[] args) {
        String text = "Это алгоритм Цезаря";
        String cipher = CaesarCryptoUtils.encript(text, 2);
        String decrypted = CaesarCryptoUtils.decript(cipher, 2);
        System.out.println(text + "\n" + cipher + "\n" + decrypted);

    }
}
