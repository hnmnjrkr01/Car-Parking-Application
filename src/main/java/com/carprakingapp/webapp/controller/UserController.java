package com.carprakingapp.webapp.controller;


import com.carprakingapp.webapp.database.dao.UserDAO;
import com.carprakingapp.webapp.database.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/userSearch")
    public ModelAndView userSearch(){

        ModelAndView response = new ModelAndView();

        response.setViewName("User/userSearch");

        return response;
    }

    @GetMapping("/searchUserByLastname")
    public ModelAndView searchUserByLastname(@RequestParam(required = false) String lastname){
        ModelAndView response = new ModelAndView();

        response.setViewName("User/foundUsers");

        if(!lastname.isEmpty()) {
            response.addObject("lastname", lastname);
            List<User> userList = userDAO.findByLastname(lastname);
            response.addObject("userList", userList);

        }else{
            response.addObject("username", "null");
        }
        return response;
    }



    @GetMapping("/edit/{id}")
    public ModelAndView editUser(@PathVariable Integer userId){
        ModelAndView response = new ModelAndView();

        response.setViewName("User/signin");

        if(!userId.equals(null)) {

            User user = userDAO.findById(userId);


        }else{
            response.addObject("username", "null");
        }
        return response;
    }








}
