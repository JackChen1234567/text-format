package com.example.textformat.stm;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TextInfo {
    private String currentLine;
    private List<String> words;
    private int lineWidth;
    private int wordPositionIndex;
    private List<String> newLines;
}
