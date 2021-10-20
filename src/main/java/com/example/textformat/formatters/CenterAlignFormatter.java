package com.example.textformat.formatters;

import com.example.textformat.factories.FormatServiceFactory;
import com.example.textformat.services.FormatService;

public class CenterAlignFormatter implements FormatterStrategy {
    private FormatService centerAlignFormatService;

    public CenterAlignFormatter() {
        centerAlignFormatService = FormatServiceFactory.createFormatService("center-align-service");
    }

    @Override
    public String formatText(String text, int width) {
        return centerAlignFormatService.applyFormat(text, width);
    }
}
