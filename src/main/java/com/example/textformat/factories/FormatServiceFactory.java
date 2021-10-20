package com.example.textformat.factories;

import com.example.textformat.exceptions.ServiceNotFound;
import com.example.textformat.services.CenterAlignFormatService;
import com.example.textformat.services.FormatService;
import com.example.textformat.services.LeftAlignFormatService;
import com.example.textformat.services.RightAlignFormatService;

public class FormatServiceFactory {
    private FormatServiceFactory() {}

    public static FormatService createFormatService(String service) {
        if (service.equals("left-align-service")) {
            return new LeftAlignFormatService();
        }else if(service.equals("right-align-service")) {
            return new RightAlignFormatService();
        }else if(service.equals("center-align-service")) {
            return new CenterAlignFormatService();
        } else {
            throw new ServiceNotFound("can not find the service: "+ service);
        }

    }
}
