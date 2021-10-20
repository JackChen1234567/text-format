package com.example.textformat.readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private ConsoleReader() {
    }

    public static String getUserInputLine() throws IOException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        return buffReader.readLine();
    }
}
