package com.example.textformat.formatters;

import com.example.textformat.factories.FormatServiceFactory;
import com.example.textformat.services.FormatService;

public class RightAlignFormatter implements FormatterStrategy {
    private FormatService rightAlignFormatService;

    public RightAlignFormatter() {
        rightAlignFormatService = FormatServiceFactory.createFormatService("right-align-service");
    }

    @Override
    public String formatText(String text, int width) {
        return rightAlignFormatService.applyFormat(text, width);
    }
}
