package com.carprakingapp.webapp.controller;


import com.mysql.cj.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class IndexController {

    @GetMapping(value ={"/", "/HomePage", "/homepage.html"})
    public ModelAndView index() {
        ModelAndView response = new ModelAndView();
        response.setViewName("HomePage");


        return response;
    }


}
