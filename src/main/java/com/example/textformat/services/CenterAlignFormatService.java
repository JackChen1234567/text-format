package com.example.textformat.services;

public class CenterAlignFormatService implements FormatService {

    @Override
    public String formatLineWithSpace(String line, int width) {
        //here use # instead of space for demo
        return line.length() > width ? line : "#".repeat((width - line.length()) / 2) + line + "#".repeat((width - line.length()) / 2 + (width - line.length()) % 2);
    }
}
