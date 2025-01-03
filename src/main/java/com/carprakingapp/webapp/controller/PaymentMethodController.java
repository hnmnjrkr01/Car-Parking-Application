package com.carprakingapp.webapp.controller;

import com.carprakingapp.webapp.database.dao.PaymentMethodDAO;
import com.carprakingapp.webapp.database.entity.PaymentMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class PaymentMethodController {

    @Autowired
    private PaymentMethodDAO paymentDAO;


    @GetMapping("/PaymentMethod/paymentMethod")
    public ModelAndView paymentMethod() {

        ModelAndView response = new ModelAndView();

        response.setViewName("/PaymentMethod/paymentMethod");

        return response;
    }

    @GetMapping("/PaymentMethod/searchPaymentMethod")
    public ModelAndView searchPaymentMethod(@RequestParam(required = false) String paymentMethod) {

        ModelAndView response = new ModelAndView();

        response.setViewName("/PaymentMethod/paymentMethod");

        response.addObject("paymentMethod", paymentMethod);

        List<PaymentMethod> paymentMethods = paymentDAO.findByPayMethod(paymentMethod);

        paymentMethods.forEach(System.out::println);

        return response;
    }

}
