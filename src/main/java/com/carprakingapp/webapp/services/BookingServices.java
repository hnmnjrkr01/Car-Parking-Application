package com.carprakingapp.webapp.services;


import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;


public class BookingServices {

    public LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public Integer durationCalculation(LocalDateTime start, LocalDateTime end) {

        Duration duration = Duration.between(start, end);
        long totalHours = duration.toHours();
    
      return ((int) totalHours);
    }

    public double availableSlots(Integer level){
        if(level == 1){
           return Math.random()*10;
        } else if (level == 2) {
            return Math.random()*20;
        }else if (level == 3) {
            return Math.random()*30;
        }
        return 0;
    }


}
