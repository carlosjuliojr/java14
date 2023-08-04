package com.julio.app.files.services;

import java.io.*;

public class FileService {

    public  void createFile(String name) throws IOException {
        File file = new File(name);
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.append("Hellow my friends\n")
                .append("All is ok\n")
                .append("Goodbye friend");
        bufferedWriter.close();
        System.out.println("file has been created successfull");
    };

    public String readFile(String url){
        StringBuilder sb = new StringBuilder();
        File file = new File(url);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    };

}
