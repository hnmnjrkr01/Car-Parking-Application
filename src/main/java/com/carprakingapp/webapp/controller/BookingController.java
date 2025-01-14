package com.carprakingapp.webapp.controller;


import com.carprakingapp.webapp.database.dao.BookingDAO;
import com.carprakingapp.webapp.database.dao.PaymentMethodDAO;
import com.carprakingapp.webapp.database.entity.Booking;
import com.carprakingapp.webapp.database.entity.PaymentMethod;
import com.carprakingapp.webapp.database.entity.User;
import com.carprakingapp.webapp.formBean.BookingDTO;
import com.carprakingapp.webapp.formBean.BookingSearchDTO;
import com.carprakingapp.webapp.security.AuthenticatedUserService;
import com.carprakingapp.webapp.services.BookingServices;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/Booking")
public class BookingController {


    @Autowired
    private BookingDAO bookingDAO;

    @Autowired
    private PaymentMethodDAO paymentMethodDAO;

    @Autowired
    private AuthenticatedUserService authenticatedUserService;

    @GetMapping("/parkingBooking")
    public ModelAndView parkingBooking() {
        ModelAndView response = new ModelAndView();
        response.setViewName("Booking/parkingBooking");

        User loggedUser = authenticatedUserService.loadCurrentUser();
        response.addObject("loggedUser", loggedUser);

//        if(bindingResult.hasErrors()) {
//            response.addObject("bindingResult", bindingResult);
//            response.addObject("bookingDTO", bookingDTO);
//        }else {
//            BookingServices services = new BookingServices();
//
//            //--------------Converting String to Date----------------------------------------------
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
//            Date startParking = formatter.parse(bookingDTO.getStartDateTime());
//            Date endParking = formatter.parse(bookingDTO.getEndDateTime());
//
//            //---------------Converting Date to localDateTime---------------------------------------
//            LocalDateTime startDateTime = services.convertToLocalDateTimeViaInstant(startParking);
//            LocalDateTime endDateTime = services.convertToLocalDateTimeViaInstant(endParking);
//
//            //--------------Calculating Duaration and Total-Price to save in Bookinf Entity------------
//            Integer duration = services.durationCalculation(startDateTime, endDateTime);
//            Double totalPrice = duration * 100.52;
//
//            //--------------------Creating Payment-Method entity first-----------------------------------
//
//            PaymentMethod payment = new PaymentMethod();
//            payment.setUserId(loggedUser.getId());
//            payment.setPaymentMethod(bookingDTO.getPaymentMethod());
//            payment.setDateOfPayment(endDateTime);
//
//            paymentMethodDAO.save(payment);
//
//            //-----------------Now will create Booking-Entity with payment-id-----------------------------
//
//            Booking booking = new Booking();
//            booking.setUserId(loggedUser.getId());
//            booking.setPaymentMethodId(payment.getPaymentId());
//            booking.setLevelId(bookingDTO.getLevelId());
//            booking.setStartDateTime(startDateTime);
//            booking.setEndDateTime(endDateTime);
//            booking.setDuration(duration);
//            booking.setTotalPrice(totalPrice);
//
//            bookingDAO.save(booking);

//        }
        return response;
    }

    @PostMapping("/bookNewParking")
    public ModelAndView bookNewParking(@Valid BookingDTO bookingDTO, BindingResult bindingResult) throws ParseException {
        ModelAndView response = new ModelAndView();
        response.setViewName("Booking/bookingParking");

        User loggedUser = authenticatedUserService.loadCurrentUser();
        response.addObject("loggedUser", loggedUser);

        if(bindingResult.hasErrors()) {
            response.addObject("bindingResult", bindingResult);
            response.addObject("bookingDTO", bookingDTO);
        }else {
            BookingServices services = new BookingServices();

            //--------------Converting String to Date----------------------------------------------
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date startParking = formatter.parse(bookingDTO.getStartDateTime());
            Date endParking = formatter.parse(bookingDTO.getEndDateTime());

            //---------------Converting Date to localDateTime---------------------------------------
            LocalDateTime startDateTime = services.convertToLocalDateTimeViaInstant(startParking);
            LocalDateTime endDateTime = services.convertToLocalDateTimeViaInstant(endParking);

            //--------------Calculating Duaration and Total-Price to save in Bookinf Entity------------
            Integer duration = services.durationCalculation(startDateTime, endDateTime);
            Double totalPrice = duration * 100.52;

            //--------------------Creating Payment-Method entity first-----------------------------------

            PaymentMethod payment = new PaymentMethod();
            payment.setUserId(loggedUser.getId());
            payment.setPaymentMethod(bookingDTO.getPaymentMethod());
            payment.setDateOfPayment(endDateTime);

            paymentMethodDAO.save(payment);

            //-----------------Now will create Booking-Entity with payment-id-----------------------------

            Booking booking = new Booking();
            booking.setUserId(loggedUser.getId());
            booking.setPaymentMethodId(payment.getPaymentId());
            booking.setLevelId(bookingDTO.getLevelId());
            booking.setStartDateTime(startDateTime);
            booking.setEndDateTime(endDateTime);
            booking.setDuration(duration);
            booking.setTotalPrice(totalPrice);

            bookingDAO.save(booking);

        }

            return response;
    }




    @GetMapping("/availableSlots")
    public ModelAndView bookingSearch(@RequestParam String startParkingTime ,
                                      @RequestParam String endParkingTime
                                      ) throws Exception {
        ModelAndView response = new ModelAndView();
        response.setViewName("Booking/availableSlots");

        SimpleDateFormat sdfStart = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date start = sdfStart.parse(startParkingTime);

        SimpleDateFormat sdfEnd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date end = sdfEnd.parse(endParkingTime);


        return response;
    }



}
