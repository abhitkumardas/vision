package com.pixel.vision.service;

import com.pixel.vision.model.response.CalendarResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Service
public class CalendarService {

    public CalendarResponse getDayFromDate(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return new CalendarResponse(String.valueOf(localDate.getDayOfYear()), localDate.getDayOfWeek().toString());
    }
}
