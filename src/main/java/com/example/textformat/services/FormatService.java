package com.example.textformat.services;

import com.example.textformat.stm.StateMachine;
import com.example.textformat.utils.WordParser;

import java.util.List;
import java.util.stream.Collectors;

public interface FormatService {

    String formatLineWithSpace(String line, int width);

    default String applyFormat(String line, int width) {
        return constructNewLines(WordParser.parserLine(line), width);
    }

    default String constructNewLines(List<String> words, int width) {
        StateMachine stateMachine = new StateMachine(words, width);
        for (int i = 0; i < words.size(); i++) {
            stateMachine.process(i);
        }
        List<String> newLines = stateMachine.getTextInfo().getNewLines();
        return newLines.stream()
                .map(s -> formatLineWithSpace(s, width) + System.lineSeparator())
                .collect(Collectors.joining());
    }
}
