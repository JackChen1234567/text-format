package com.example.textformat.factories;

import com.example.textformat.exceptions.ServiceNotFound;
import com.example.textformat.services.CenterAlignFormatService;
import com.example.textformat.services.LeftAlignFormatService;
import com.example.textformat.services.RightAlignFormatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceFactoryTest {

    @Test
    public void testServiceFactorySuccessful() {
        assertTrue(FormatServiceFactory.createFormatService("left-align-service") instanceof LeftAlignFormatService);
        assertTrue(FormatServiceFactory.createFormatService("right-align-service") instanceof RightAlignFormatService);
        assertTrue(FormatServiceFactory.createFormatService("center-align-service") instanceof CenterAlignFormatService);
    }

    @Test
    public void testServiceFactoryException() {
        Assertions.assertThrows(ServiceNotFound.class, () -> FormatServiceFactory.createFormatService("wrong-name-service"));
    }
}
