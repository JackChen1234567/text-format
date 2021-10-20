package com.example.textformat.factories;

import com.example.textformat.enumerations.FormatType;
import com.example.textformat.formatters.CenterAlignFormatter;
import com.example.textformat.formatters.FormatterStrategy;
import com.example.textformat.formatters.LeftAlignFormatter;
import com.example.textformat.formatters.RightAlignFormatter;

public class FormatterFactory {
    private FormatterFactory() {}

    public  static FormatterStrategy create(FormatType type) {
        switch (type) {
            case RIGHT_ALIGN:
                return new RightAlignFormatter();
            case CENTER_ALIGN:
                return new CenterAlignFormatter();
            default:
                return new LeftAlignFormatter();
        }
    }
}
