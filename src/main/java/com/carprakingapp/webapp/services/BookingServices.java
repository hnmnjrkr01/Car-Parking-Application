package com.carprakingapp.webapp.services;

import com.carprakingapp.webapp.database.entity.Booking;
import com.carprakingapp.webapp.formBean.BookingDTO;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;


public class BookingServices {


    public long durationCalculation(LocalDateTime start, LocalDateTime end) {

        Duration duration = Duration.between(start, end);
        long totalHours = duration.toHours();


      return totalHours;
    }

    public double totalPriceCalculation(LocalDateTime start, LocalDateTime end) {

        long totalHours = durationCalculation(start, end);
        double totalPrice = 0;


        return totalPrice;
    }


}
