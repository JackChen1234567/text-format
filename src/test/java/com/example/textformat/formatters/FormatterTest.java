package com.example.textformat.formatters;

import com.example.textformat.enumerations.FormatType;
import com.example.textformat.factories.FormatterFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatterTest {
    @Test
    public void testLeftFormatter() {
        String textNeedToBeFormat = "This text should be left aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text#" + System.lineSeparator() + "should be#" + System.lineSeparator() + "left######" + System.lineSeparator() + "aligned###" + System.lineSeparator();
        String newText = FormatterFactory.create(FormatType.LEFT_ALIGN).formatText(textNeedToBeFormat, 10);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testRightFormatter() {
        String textNeedToBeFormat = "This text should be right aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "#This text" + System.lineSeparator() + "#should be" + System.lineSeparator() + "#####right" + System.lineSeparator() + "###aligned" + System.lineSeparator();
        String newText = FormatterFactory.create(FormatType.RIGHT_ALIGN).formatText(textNeedToBeFormat, 10);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testCenterFormatter() {
        String textNeedToBeFormat = "This text should be center aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text#" + System.lineSeparator() + "should be#" + System.lineSeparator() + "##center##" + System.lineSeparator() + "#aligned##" + System.lineSeparator();
        String newText = FormatterFactory.create(FormatType.CENTER_ALIGN).formatText(textNeedToBeFormat, 10);
        assertEquals(expectedResult, newText);
    }
}
