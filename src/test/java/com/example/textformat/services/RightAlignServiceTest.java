package com.example.textformat.services;

import com.example.textformat.factories.FormatServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightAlignServiceTest {
    @Test
    public void testRightAlignServiceWidth10() {
        String textNeedToBeFormat = "This text should be right aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "#This text" + System.lineSeparator() + "#should be" + System.lineSeparator() + "#####right" + System.lineSeparator() + "###aligned" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("right-align-service").applyFormat(textNeedToBeFormat, 10);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testRightAlignServiceWidth20Test() {
        String textNeedToBeFormat = "This text should be right aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "#This text should be" + System.lineSeparator() + "#######right aligned" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("right-align-service").applyFormat(textNeedToBeFormat, 20);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testRightAlignServiceWidth30Test() {
        String textNeedToBeFormat = "This text should be right aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "#####This text should be right" + System.lineSeparator() + "#######################aligned" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("right-align-service").applyFormat(textNeedToBeFormat, 30);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testRightAlignServiceWidth40Test() {
        String textNeedToBeFormat = "This text should be right aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "#######This text should be right aligned" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("right-align-service").applyFormat(textNeedToBeFormat, 40);
        assertEquals(expectedResult, newText);
    }
}
