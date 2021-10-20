package com.example.textformat.services;

import com.example.textformat.factories.FormatServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftAlignServiceTest {
    @Test
    public void testLeftAlignWidth10() {
        String textNeedToBeFormat = "This text should be left aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text#" + System.lineSeparator() + "should be#" + System.lineSeparator() + "left######" + System.lineSeparator() + "aligned###" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("left-align-service").applyFormat(textNeedToBeFormat, 10);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testLeftAlignWidth20() {
        String textNeedToBeFormat = "This text should be left aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text should be#" + System.lineSeparator() + "left aligned########" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("left-align-service").applyFormat(textNeedToBeFormat, 20);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testLeftAlignWidth30() {
        String textNeedToBeFormat = "This text should be left aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text should be left######" + System.lineSeparator() + "aligned#######################" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("left-align-service").applyFormat(textNeedToBeFormat, 30);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testLeftAlignWidth40() {
        String textNeedToBeFormat = "This text should be left aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text should be left aligned########" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("left-align-service").applyFormat(textNeedToBeFormat, 40);
        assertEquals(expectedResult, newText);
    }
}
