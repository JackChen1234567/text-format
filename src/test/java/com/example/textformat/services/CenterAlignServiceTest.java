package com.example.textformat.services;

import com.example.textformat.factories.FormatServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenterAlignServiceTest {

    @Test
    public void testAlignCenterWidth10WordLongThanWidth() {
        String textNeedToBeFormat = "Thistextshould be center aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "Thistextshould" + System.lineSeparator() + "be center#" + System.lineSeparator() + "#aligned##" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("center-align-service").applyFormat(textNeedToBeFormat, 10);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testAlignCenterWidth10() {
        String textNeedToBeFormat = "This text should be center aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text#" + System.lineSeparator() + "should be#" + System.lineSeparator() + "##center##" + System.lineSeparator() + "#aligned##" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("center-align-service").applyFormat(textNeedToBeFormat, 10);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testAlignCenterWidth20() {
        String textNeedToBeFormat = "This text should be center aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "This text should be#" + System.lineSeparator() + "###center aligned###" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("center-align-service").applyFormat(textNeedToBeFormat, 20);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testAlignCenterWidth30() {
        String textNeedToBeFormat = "This text should be center aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "##This text should be center##" + System.lineSeparator() + "###########aligned############" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("center-align-service").applyFormat(textNeedToBeFormat, 30);
        assertEquals(expectedResult, newText);
    }

    @Test
    public void testAlignCenterWidth40() {
        String textNeedToBeFormat = "This text should be center aligned ";
        //use # instead of space to show the number of space
        String expectedResult = "###This text should be center aligned###" + System.lineSeparator();
        String newText = FormatServiceFactory.createFormatService("center-align-service").applyFormat(textNeedToBeFormat, 40);
        assertEquals(expectedResult, newText);
    }
}
