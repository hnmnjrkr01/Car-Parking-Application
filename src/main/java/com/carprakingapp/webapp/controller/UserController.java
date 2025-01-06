package com.carprakingapp.webapp.controller;


import com.carprakingapp.webapp.database.dao.UserDAO;
import com.carprakingapp.webapp.database.entity.User;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/user")
    public ModelAndView user(){

        ModelAndView response = new ModelAndView();

        response.setViewName("/User/user");

        return response;
    }

    @GetMapping("/searchUser")
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

    @GetMapping("/searchUserByUsername/{username}")
    @ResponseBody
    public ModelAndView searchUserByUsername(@PathVariable String username){
        ModelAndView response = new ModelAndView();

        response.setViewName("/User/signin");

        if(!username.isEmpty()) {
            response.addObject("username", username);

            User user = userDAO.findByUsername(username);
            response.addObject("user", user);
        }else{
            response.addObject("username", "null");
        }


        return response;
    }

//  @GetMapping("/searchUserByLastname/{username}")
//    public ResponseEntity<User> searchUserByLastname(@PathVariable String username){
//
//        if(!username.isEmpty()){
//            User user = userDAO.findByUsername(username);
//            return new ResponseEntity<User>(user,new HttpHeaders(), HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//    }













































}
