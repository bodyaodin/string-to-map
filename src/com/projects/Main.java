package com.projects;

import java.io.IOException;
import java.util.Map;

public class Main {
    private static final String PATH = "src/com/projects/TextForParsing.txt";

    public static void main(String[] args) throws IOException {
        StringHandler stringHandler = new StringHandler();
        Map<String, Integer> countOfWords = stringHandler.countingWords(PATH);

        printMap(countOfWords);
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }

}
