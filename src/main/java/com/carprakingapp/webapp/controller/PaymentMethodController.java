package com.carprakingapp.webapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class PaymentMethodController {

    @GetMapping("/PaymentMethod/paymentMethod")
    public ModelAndView booking(){

        ModelAndView response = new ModelAndView();

        response.setViewName("/PaymentMethod/paymentMethod");

        return response;
    }

}
