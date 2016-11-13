package com.goit.gojavaonline.module10;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamOperations {
    public void write(final String data, final File file) throws IOException {
        FileWriter outputStream = new FileWriter(file);
        try {
            outputStream.write(data);
        } finally {
            outputStream.close();
        }
    }


    public String read(File file) throws IOException {
        FileReader inputStream = new FileReader(file);
        StringBuilder readingText = new StringBuilder();
        try {
            while (inputStream.ready()) {
                readingText.append((char) inputStream.read());
            }
        } finally {

            inputStream.close();
        }
        return readingText.toString();
    }

}
