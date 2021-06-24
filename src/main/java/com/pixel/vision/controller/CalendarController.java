package com.pixel.vision.controller;

import com.pixel.vision.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @GetMapping("/calendar/day")
    public ResponseEntity getCalendarData(@RequestParam @DateTimeFormat(pattern="MM/dd/yyyy") Date date) {
        return ResponseEntity.ok(calendarService.getDayFromDate(date));
    }
}
