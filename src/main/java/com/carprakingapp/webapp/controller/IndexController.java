package com.carprakingapp.webapp.controller;


import com.mysql.cj.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
//@PreAuthorize("hasAuthority('CUSTMR')")
public class IndexController {

    @GetMapping(value ={"/", "/HomePage", "/homepage.html"})
    public ModelAndView homepage() {
        ModelAndView response = new ModelAndView();
        response.setViewName("HomePage");


        return response;
    }

    @GetMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView response = new ModelAndView();
        response.setViewName("index");


        return response;
    }

}
