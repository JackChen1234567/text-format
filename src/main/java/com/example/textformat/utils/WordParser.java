package com.example.textformat.utils;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class WordParser {
    private WordParser() {
    }

    public static List<String> parserLine(String textLine) {
        return Collections.list(new StringTokenizer(textLine)).stream()
                .map(String.class::cast)
                .collect(Collectors.toList());
    }
}
