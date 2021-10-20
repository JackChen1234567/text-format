package com.example.textformat.factories;

import com.example.textformat.enumerations.FormatType;
import com.example.textformat.formatters.CenterAlignFormatter;
import com.example.textformat.formatters.LeftAlignFormatter;
import com.example.textformat.formatters.RightAlignFormatter;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormatterFactoryTest {
    @Test
    public void testFactory() {
        assertTrue(FormatterFactory.create(FormatType.CENTER_ALIGN) instanceof CenterAlignFormatter);
        assertTrue(FormatterFactory.create(FormatType.LEFT_ALIGN) instanceof LeftAlignFormatter);
        assertTrue(FormatterFactory.create(FormatType.RIGHT_ALIGN) instanceof RightAlignFormatter);
    }
}
