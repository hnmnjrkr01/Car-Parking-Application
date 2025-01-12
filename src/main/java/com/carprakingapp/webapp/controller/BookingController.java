package com.carprakingapp.webapp.controller;


import com.carprakingapp.webapp.database.dao.BookingDAO;
import com.carprakingapp.webapp.database.entity.Booking;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/Booking")
public class BookingController {

    @Autowired
    private BookingDAO bookingDAO;


//    @GetMapping("/parkingBooking")
//    public ModelAndView booking(){
//
//        ModelAndView response = new ModelAndView();
//
//        response.setViewName("Booking/parkingBooking");
//
//        return response;
//    }

    @GetMapping("/searchBooking")
    public ModelAndView searchBooking(@RequestParam Integer bookingId ){

        ModelAndView response = new ModelAndView();

        response.setViewName("parkingBooking");

        response.addObject("bookingId", bookingId);

        Booking booking = bookingDAO.findByBookingId(bookingId);

        System.out.println(booking);

        return response;
    }

}
