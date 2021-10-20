package com.example.textformat;

import com.example.textformat.formatters.FormatterStrategy;
import com.example.textformat.readers.ConsoleReader;
import com.example.textformat.utils.FormatterUtil;

import java.io.IOException;

public class TextFormatApplication {
    public static void main(String[] args) throws IOException {
        String exit = "n";
        while (!exit.equals("y")) {
            System.out.println("Enter the text you would like to align and click enter: ");
            String textNeedToBeFormatted = ConsoleReader.getUserInputLine();

            System.out.println("Enter formatter type name (1-left align,  2-right align,  3-center align): ");
            String formatterType = ConsoleReader.getUserInputLine();

            System.out.println("Enter width of line : ");
            String width = ConsoleReader.getUserInputLine();

            FormatterStrategy formatterStrategy = FormatterUtil.getFormatter(Integer.parseInt(formatterType));
            String newLines = formatterStrategy.formatText(textNeedToBeFormatted, Integer.parseInt(width));
            System.out.println(newLines);

            System.out.println("Exit the application(enter y/n): ");
            exit = ConsoleReader.getUserInputLine();
        }
    }
}
