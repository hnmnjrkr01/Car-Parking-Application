package com.carprakingapp.webapp.controller;

import com.carprakingapp.webapp.database.dao.UserDAO;
import com.carprakingapp.webapp.database.entity.User;
import com.carprakingapp.webapp.formBean.UserDTO;
import com.carprakingapp.webapp.security.AuthenticatedUserService;
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
@RequestMapping("/login")
public class CreateUserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private AuthenticatedUserService authenticatedUserService;

    @GetMapping("/signUp")
    public ModelAndView loadSignIn(){

        ModelAndView response = new ModelAndView();
        response.setViewName("login/createUser");

        return response;


    }

    @PostMapping("/createUser")
    public ModelAndView createUser(@Valid UserDTO userDTO,
                                   BindingResult bindingResult,
                                   HttpSession session){

        ModelAndView response = new ModelAndView();
        response.setViewName("login/createUser");

        if(bindingResult.hasErrors()) {
            response.addObject("bindingResult", bindingResult);
            response.addObject("userDTO", userDTO);
        }else{
            User newUser = userDAO.findByUsername(userDTO.getUsername());
            if(newUser == null) {
                newUser = new User();
            }

            //----Checking the the password and confirm password should match--------------------
            if(StringUtils.equals(userDTO.getPassword(), userDTO.getConfirmPassword())) {

                String encryptedPassword = passwordEncoder.encode(userDTO.getPassword());
                newUser.setPassword(encryptedPassword);
            }else{
                bindingResult.rejectValue("confirmPassword", "error", "passwords do not match");
            }
            //----------------------------------------------------------------------------------
            newUser.setUsername(userDTO.getUsername());
            newUser.setFirstname(userDTO.getFirstname());
            newUser.setLastname(userDTO.getLastname());
            newUser.setPhone(userDTO.getPhone());
            newUser.setEmail(userDTO.getEmail());

            userDAO.save(newUser);

            LOG.info("User created: " + newUser.toString());

            authenticatedUserService.changeLoggedInUsername(session,userDTO.getUsername(),userDTO.getPassword());

            response.setViewName("redirect:/");
        }

        return response;
    }
}
