package com.carprakingapp.webapp.controller;


import com.carprakingapp.webapp.database.dao.UserDAO;
import com.carprakingapp.webapp.database.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/User/user")
    public ModelAndView user(){

        ModelAndView response = new ModelAndView();

        response.setViewName("/User/user");

        return response;
    }

    @GetMapping("/User/searchUser")
    public ModelAndView searchUser(@RequestParam(required = false) String lastname){

        ModelAndView response = new ModelAndView();

        response.setViewName("/User/user");


        response.addObject("lastname", lastname);

        if(lastname != null ) {                                  //&& !lastname.isEmpty()){
            List<User> userList = userDAO.findByLastname(lastname);
            userList.forEach(System.out::println);
        }else{
            System.out.println("Object is null");
        }



        return response;
    }




}
