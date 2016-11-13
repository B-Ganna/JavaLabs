package com.goit.gojavaonline.module10;

import com.goit.gojavaonline.module9.CaesarCryptograph;

import java.io.File;
import java.io.IOException;

public class IOStreamApp {
    public static void main(String[] args) throws IOException {
        CaesarCryptograph cryptograph = new CaesarCryptograph(3, "qwertyuiopasdfghjlzxc");
        IOStreamOperations operations = new IOStreamOperations();

        File inputFile = new File("xandau.txt");
        File encryptedFile = new File("encryptedFile.txt");
        File decryptedFile = new File("decryptedFile.txt");

        try {
            String input = operations.read(inputFile);
            String encrypt = cryptograph.encrypt(input);
            operations.write(encrypt, encryptedFile);
            String inputEncrypted = operations.read(encryptedFile);
            String decrypt = cryptograph.decrypt(inputEncrypted);
            operations.write(decrypt, decryptedFile);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
