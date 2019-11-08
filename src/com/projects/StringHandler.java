package com.projects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StringHandler {

    private static final String SIGN_SPLITTER = "[\\W_]+";

    private String[] parseToWords(String path) throws IOException {
        return Files.readString(Paths.get(path))
                    .toLowerCase()
                    .split(SIGN_SPLITTER);
    }

    public Map<String, Integer> countingWords(String path) throws IOException {
        String[] words = parseToWords(path);
        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            int increment = 1;
            wordsCount.merge(word, increment, Integer::sum);
        }
        return wordsCount;
    }
}
