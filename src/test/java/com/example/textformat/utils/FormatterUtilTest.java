package com.example.textformat.utils;

import com.example.textformat.formatters.CenterAlignFormatter;
import com.example.textformat.formatters.FormatterStrategy;
import com.example.textformat.formatters.LeftAlignFormatter;
import com.example.textformat.formatters.RightAlignFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormatterUtilTest {

    @Test
    public void testFormatter() {
        FormatterStrategy formatterStrategy = FormatterUtil.getFormatter(1);
        assertTrue(formatterStrategy instanceof LeftAlignFormatter);
        formatterStrategy = FormatterUtil.getFormatter(2);
        assertTrue(formatterStrategy instanceof RightAlignFormatter);
        formatterStrategy = FormatterUtil.getFormatter(3);
        assertTrue(formatterStrategy instanceof CenterAlignFormatter);
    }
}
