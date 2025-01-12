package com.carprakingapp.webapp.controller;


import com.carprakingapp.webapp.database.dao.UserDAO;
import com.carprakingapp.webapp.database.entity.User;
import com.carprakingapp.webapp.formBean.UserDTO;
import com.carprakingapp.webapp.security.AuthenticatedUserService;
import com.carprakingapp.webapp.services.IUserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Slf4j
@Controller
@RequestMapping("/User")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    private static String DUMMY_VALUE = "DUMMYVALUE";

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private IUserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticatedUserService authenticatedUserService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/userSearch")
    public ModelAndView userSearch(){

        ModelAndView response = new ModelAndView();

        response.setViewName("User/userSearch");

        return response;
    }

    @PreAuthorize("hasAuthority('ADMIN')")
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

    @GetMapping("/editUser")
    public ModelAndView editUser(){

        ModelAndView response = new ModelAndView();
        response.setViewName("User/editUser");

        return response;
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/edit/{userId}")
    public ModelAndView editUser(@PathVariable Integer userId){
        ModelAndView response = new ModelAndView();

        response.setViewName("User/editUser");

        if(userId != null) {

            User user = userDAO.findById(userId);
            UserDTO userDTO = new UserDTO();

            userDTO.setId(user.getId());
            userDTO.setUsername(this.DUMMY_VALUE);
            userDTO.setPassword(this.DUMMY_VALUE);
            userDTO.setConfirmPassword(this.DUMMY_VALUE);
            userDTO.setFirstname(user.getFirstname());
            userDTO.setLastname(user.getLastname());
            userDTO.setEmail(user.getEmail());
            userDTO.setPhone(user.getPhone());

            //once data is Edited in Jsp page set the data back in databasE
            response.addObject("userDTO", userDTO);


        }else{
            //bindingResult.rejectValue();
        }
        return response;
    }

    @PostMapping("/editSubmit")
    public ModelAndView editSubmit(@Valid UserDTO userDTO, BindingResult bindingResult){
        ModelAndView response = new ModelAndView();

        response.setViewName("User/editUser");

        if(bindingResult.hasErrors()) {

            response.addObject("bindingResult", bindingResult);
            response.addObject("userDTO", userDTO);
        }else {

            User user = userDAO.findById(userDTO.getId());

            user.setFirstname(userDTO.getFirstname());
            user.setLastname(userDTO.getLastname());
            user.setEmail(userDTO.getEmail());
            user.setPhone(userDTO.getPhone());

            userDAO.save(user);

        }
//        response.setViewName("OtherPages/success");

        return response;
    }


    @GetMapping("/signUp")
    public ModelAndView loadSignIn(){

        ModelAndView response = new ModelAndView();
        response.setViewName("User/signUp");

        return response;


    }


    @GetMapping("/myself/{loggedUserId}")
    public ModelAndView edit(@PathVariable Integer loggedUserId){
        ModelAndView response = new ModelAndView();
        response.setViewName("User/signUp");
        User userDTO = userDAO.findById(loggedUserId);
        response.addObject("userDTO", userDTO);
        return response;
    }






}
