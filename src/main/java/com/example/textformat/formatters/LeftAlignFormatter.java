package com.example.textformat.formatters;

import com.example.textformat.factories.FormatServiceFactory;
import com.example.textformat.services.FormatService;

public class LeftAlignFormatter implements FormatterStrategy {

    private FormatService leftAlignFormatService;

    public LeftAlignFormatter() {
        leftAlignFormatService = FormatServiceFactory.createFormatService("left-align-service");
    }

    @Override
    public String formatText(String text, int width) {
        return leftAlignFormatService.applyFormat(text, width);
    }
}
