package com.julio.app.files;

import com.julio.app.files.services.FileService;

public class ExampleReadFile {
    public static void main(String[] args) {
        String nameFile = "C:\\Users\\GOD\\Documents\\personal\\Curses\\Java\\file\\java.txt";
        FileService fileService = new FileService();
        System.out.println("fileService.readFile(nameFile) = " + fileService.readFile(nameFile));
    }
}
