package com.example.textformat.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordParserTest {

    @Test
    public void testWordParser() {
        String textLine = "This text should be left aligned";
        int expectedWordCounter = 6;
        List<String> words = WordParser.parserLine(textLine);
        assertEquals(expectedWordCounter, words.size());
        assertTrue(words.contains("This"));
        assertTrue(words.contains("text"));
        assertTrue(words.contains("should"));
        assertTrue(words.contains("be"));
        assertTrue(words.contains("left"));
        assertTrue(words.contains("aligned"));
    }
}
