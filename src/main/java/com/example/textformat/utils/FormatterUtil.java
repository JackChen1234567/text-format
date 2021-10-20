package com.example.textformat.utils;

import com.example.textformat.enumerations.FormatType;
import com.example.textformat.factories.FormatterFactory;
import com.example.textformat.formatters.FormatterStrategy;

public class FormatterUtil {
    private FormatterUtil() {

    }

    public static FormatterStrategy getFormatter(int number) {
        switch (number) {
            case 2:
                return FormatterFactory.create(FormatType.RIGHT_ALIGN);
            case 3:
                return FormatterFactory.create(FormatType.CENTER_ALIGN);
            default:
                return FormatterFactory.create(FormatType.LEFT_ALIGN);
        }
    }
}
