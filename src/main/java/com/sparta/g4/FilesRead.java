package com.sparta.g4;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesRead {

    public static void main(String[] args) throws IOException {
        String p = "/Users/artemmoroz/Projects/training/sparta/src/main/resources/words.txt";

        String content = new String(Files.readAllBytes(Paths.get(p)));

        List<String> lines = Files.readAllLines(Paths.get(p));

        System.out.println(lines.size());

        //System.out.println(content);

    }

}
