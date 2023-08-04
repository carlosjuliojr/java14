package com.julio.app.files;

import com.julio.app.files.services.FileService;

import java.io.IOException;

public class ExampleCreateFile {

    public static void main(String[] args) {

        String nameFile = "C:\\Users\\GOD\\Documents\\personal\\Curses\\Java\\file\\java.txt";
        FileService service = new FileService();


        try {
            service.createFile(nameFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
