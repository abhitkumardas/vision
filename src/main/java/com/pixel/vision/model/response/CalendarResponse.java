package com.pixel.vision.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalendarResponse {
    private String day;
    private String dayOfWeek;
}
